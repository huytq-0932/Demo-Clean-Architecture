package com.tr4n.basedemo.screen.base.recyclerview

import androidx.recyclerview.widget.DiffUtil

abstract class BaseDiffUtilItemCallback<T : RecyclerViewItem> : DiffUtil.ItemCallback<T>() {

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean =
        oldItem == newItem
}
