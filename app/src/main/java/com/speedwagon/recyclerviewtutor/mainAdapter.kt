package com.speedwagon.recyclerviewtutor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class mainAdapter (
    private val userList: ArrayList<listItem>
        ) : RecyclerView.Adapter<mainAdapter.mViewHolder>(){
    inner class mViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        val mName : TextView = itemView.findViewById(R.id.textView)
        val mNumber : TextView = itemView.findViewById(R.id.textView2)
        val mProfile : ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): mViewHolder {
        return mViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: mViewHolder, position: Int) {
        val item = userList[position]
        holder.apply {
            item.apply {
                mName.text = name
                mNumber.text = phoneNumber
                mProfile.setImageResource(profilePhoto)
            }
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}