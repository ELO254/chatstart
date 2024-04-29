package com.example.groupi_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class fromAdapter(var data:List<Any>) :RecyclerView.Adapter<fromAdapter.viewHolder>() {
    class viewHolder(view: View):RecyclerView.ViewHolder(view){
        var textView:TextView = view.findViewById(R.id.txtfrom)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.from, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.textView.text = data[position].toString()

    }
}