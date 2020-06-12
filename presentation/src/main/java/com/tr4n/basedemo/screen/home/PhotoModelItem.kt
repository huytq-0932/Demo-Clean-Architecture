package com.tr4n.basedemo.screen.home

import com.tr4n.basedemo.model.PhotoModel
import com.tr4n.basedemo.screen.base.recyclerview.RecyclerViewItem
import com.tr4n.basedemo.screen.base.recyclerview.TYPE_ITEM

data class PhotoModelItem(
    val model: PhotoModel,
    override var type: Int = TYPE_ITEM
) : RecyclerViewItem
