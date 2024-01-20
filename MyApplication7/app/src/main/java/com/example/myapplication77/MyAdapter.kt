package com.example.myapplication77

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private val userList = ArrayList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_rcv, parent, false
        )

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = userList[position]

        Picasso.get().load(currentItem.image).into(holder.image)

        holder.value.text = currentItem.name

        holder.rating.text = currentItem.type

        holder.height.text = currentItem.height

        //println(currentItem.image + " " + currentItem.value)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun updateUserList(userList: List<User>)
    {
        this.userList.clear()

        this.userList.addAll(userList)

        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.rcvImg)

        val value: TextView = itemView.findViewById(R.id.currency_name)

        val rating : TextView = itemView.findViewById(R.id.astronaut_craft)

        val height: TextView = itemView.findViewById(R.id.meters)
    }

}