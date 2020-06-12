package com.tr4n.basedemo.screen.main

import com.tr4n.basedemo.R
import com.tr4n.basedemo.base.BaseActivity
import com.tr4n.basedemo.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResource get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun initComponents() {
    }

    override fun observeData() {
    }
}
