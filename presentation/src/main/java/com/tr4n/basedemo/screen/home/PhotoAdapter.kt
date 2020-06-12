package com.tr4n.basedemo.screen.home

import android.view.ViewGroup
import com.tr4n.basedemo.R
import com.tr4n.basedemo.databinding.ItemPhotoBinding
import com.tr4n.basedemo.screen.base.recyclerview.BaseDiffUtilItemCallback
import com.tr4n.basedemo.screen.base.recyclerview.BaseRecyclerAdapter
import com.tr4n.basedemo.screen.base.recyclerview.BaseViewHolder

class PhotoAdapter :
    BaseRecyclerAdapter<PhotoModelItem, ItemPhotoBinding, PhotoAdapter.PhotoViewHolder>(
        PhotoDiffUtilCallback()
    ) {

    override fun getItemLayoutResource(viewType: Int) = R.layout.item_photo

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PhotoViewHolder(
        binding = getViewHolderDataBinding(parent, viewType) as ItemPhotoBinding
    )

    class PhotoViewHolder(binding: ItemPhotoBinding) :
        BaseViewHolder<PhotoModelItem, ItemPhotoBinding>(binding) {

        override fun bind(itemData: PhotoModelItem) {
            super.bind(itemData)
            binding.photo = itemData.model
        }
    }

    class PhotoDiffUtilCallback : BaseDiffUtilItemCallback<PhotoModelItem>() {
        override fun areItemsTheSame(oldItem: PhotoModelItem, newItem: PhotoModelItem): Boolean =
            oldItem.model.id == newItem.model.id
    }
}
