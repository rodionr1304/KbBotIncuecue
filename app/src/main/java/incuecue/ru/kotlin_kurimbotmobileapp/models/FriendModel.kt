package incuecue.ru.kotlin_kurimbotmobileapp.models

class FriendModel(
    private var name: String,
    private var surname: String,
    private var city: String?,
    private var avatar: String?,
    isOnline: Boolean
) {

    private var inOnline: Boolean = isOnline

}