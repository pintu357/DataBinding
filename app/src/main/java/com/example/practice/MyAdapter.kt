package com.example.practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val list : List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.listView.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var listView = itemView.findViewById<TextView>(R.id.title)
    }

}


