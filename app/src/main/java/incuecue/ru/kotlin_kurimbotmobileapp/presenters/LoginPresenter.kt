package incuecue.ru.kotlin_kurimbotmobileapp.presenters

import android.os.Handler
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import incuecue.ru.kotlin_kurimbotmobileapp.R
import incuecue.ru.kotlin_kurimbotmobileapp.views.LoginView

@InjectViewState
open class LoginPresenter: MvpPresenter<LoginView>() {
    fun login(isSuccess: Boolean) {
        viewState.startLoading()
        Handler().postDelayed({
            viewState.endLoading()
            if (isSuccess) {
                viewState.openFriends()
            } else {
                viewState.showError(textResource = R.string.login_error_credentials)
            }
        }, 500)
    }
}