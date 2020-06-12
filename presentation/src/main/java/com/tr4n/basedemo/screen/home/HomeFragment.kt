package com.tr4n.basedemo.screen.home

import com.tr4n.basedemo.R
import com.tr4n.basedemo.screen.base.BaseFragment
import com.tr4n.basedemo.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val layoutResource get() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModel()

    private val photoAdapter by lazy {
        PhotoAdapter()
    }

    override fun setUpView() {
        recyclerPhotos.adapter = photoAdapter
    }

    override fun setBindingVariables() {
        viewDataBinding.viewModel = viewModel
    }

    override fun initData() {
        viewModel.getImageUrls()
    }
}
