package com.greenmily.profiler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class IconAdapter(
    private val items: List<Icondata>,
    private val callBack: IconInteractionCallBack
): RecyclerView.Adapter<IconViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder = IconViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.second_activity, parent, false)
    )

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val item = items[position]
        holder.apply {
            bind(item)
             itemView.setOnClickListener{
             callBack.onClick(item)
             }
        }
    }
}