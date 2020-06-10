package com.tr4n.basedemo.screen.home

import com.tr4n.basedemo.R
import com.tr4n.basedemo.base.BaseFragment
import com.tr4n.basedemo.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val layoutResource get() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModel()
}
