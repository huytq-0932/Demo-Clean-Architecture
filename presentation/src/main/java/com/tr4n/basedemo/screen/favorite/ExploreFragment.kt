package com.tr4n.basedemo.screen.favorite

import com.tr4n.basedemo.R
import com.tr4n.basedemo.screen.base.BaseFragment
import com.tr4n.basedemo.databinding.FragmentExploreBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ExploreFragment : BaseFragment<FragmentExploreBinding, ExploreViewModel>() {

    override val layoutResource get() = R.layout.fragment_explore
    override val viewModel: ExploreViewModel by viewModel()
}
