package com.tr4n.basedemo.screen.explore

import com.tr4n.basedemo.R
import com.tr4n.basedemo.screen.base.BaseFragment
import com.tr4n.basedemo.databinding.FragmentFavoriteBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>() {
    override val layoutResource get() = R.layout.fragment_favorite
    override val viewModel: FavoriteViewModel by viewModel()
}
