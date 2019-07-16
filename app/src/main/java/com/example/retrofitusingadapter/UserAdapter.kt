package com.example.retrofitusingadapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.user_layout.view.*


class UserAdapter(private val users:List<User>):
    RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = li.inflate(R.layout.user_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.itemView.tvEmail.text = Integer.toString(user.id)
        holder.itemView.tvUsername.text=Integer.toString(user.userId)
        holder.itemView.tvName.text=Integer.toString(user.title)

    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
}