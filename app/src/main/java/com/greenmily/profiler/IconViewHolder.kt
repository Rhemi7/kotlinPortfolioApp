package com.greenmily.profiler

import android.view.View
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.second_activity.view.*

class IconViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
    fun bind(item: Icondata) = with(itemView) {
image.setImageResource(item.logo)
        name.text = item.title
    }

}