package incuecue.ru.kotlin_kurimbotmobileapp.activites

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.github.rahatarmanahmed.cpv.CircularProgressView
import incuecue.ru.kotlin_kurimbotmobileapp.R
import incuecue.ru.kotlin_kurimbotmobileapp.presenters.LoginPresenter
import incuecue.ru.kotlin_kurimbotmobileapp.views.LoginView
import javax.inject.Inject

class LoginActivity : MvpAppCompatActivity(), LoginView {

    private lateinit var mTxtHello: TextView
    private lateinit var mBtnEnter: Button
    private lateinit var mCpvWait: CircularProgressView
    @InjectPresenter
    lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mTxtHello = findViewById(R.id.txt_login_hello)
        mBtnEnter = findViewById(R.id.btn_login_enter)
        mCpvWait = findViewById(R.id.cpv_login)

        mBtnEnter.setOnClickListener {
            loginPresenter.login(isSuccess = true)
        }
    }

    override fun startLoading() {
        mBtnEnter.visibility =  View.GONE
        mCpvWait.visibility = View.VISIBLE
    }

    override fun endLoading() {
        mBtnEnter.visibility = View.VISIBLE
        mCpvWait.visibility = View.GONE
    }

    override fun showError(textResource: Int) {
        Toast.makeText(applicationContext, getString(textResource), Toast.LENGTH_SHORT).show()
    }

    override fun openFriends() {
        startActivity(Intent(applicationContext, FriendsActivity::class.java))
    }
}
