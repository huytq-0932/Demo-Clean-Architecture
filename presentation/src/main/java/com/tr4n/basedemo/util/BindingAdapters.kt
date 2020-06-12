package com.tr4n.basedemo.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tr4n.basedemo.screen.base.recyclerview.BindableAdapter
import com.tr4n.basedemo.screen.base.recyclerview.RecyclerViewItem

@BindingAdapter("items")
fun <T : RecyclerViewItem> setAdapterData(view: RecyclerView, items: List<T>?) {
    val adapter = view.adapter
    if (adapter is BindableAdapter<*>) {
        (adapter as BindableAdapter<T>).setItems(items ?: emptyList())
    }
}

@BindingAdapter("imageUrl")
fun setImageUrl(view: ImageView, url: String?) {
    url?.let {
        Glide.with(view.context)
            .load(it)
            .placeholder(android.R.color.holo_purple)
            .into(view)
    }
}
