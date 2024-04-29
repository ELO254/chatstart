package com.example.groupi_recycleview

import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class toAdapter:RecyclerView.Adapter<toAdapter.viewHolder>() {
    class viewHolder(view: View):RecyclerView.ViewHolder(view){
        var textView:TextView = view.findViewById(R.id.txtfrom)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.from, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.textView.text = position.toString()

    }
}