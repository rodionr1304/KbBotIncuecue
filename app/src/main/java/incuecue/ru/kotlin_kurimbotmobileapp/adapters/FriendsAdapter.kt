package incuecue.ru.kotlin_kurimbotmobileapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import incuecue.ru.kotlin_kurimbotmobileapp.R
import incuecue.ru.kotlin_kurimbotmobileapp.models.FriendModel

class FriendsAdapte: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mFriendsList: ArrayList<FriendModel> = ArrayList()

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val itemView =  layoutInflater.inflate(R.layout.cell_friend, p0, false)
        return FriendsViewHolder(itemView = itemView)
    }

    override fun getItemCount(): Int {
        return mFriendsList.count()
    }

    class FriendsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}