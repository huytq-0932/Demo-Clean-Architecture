package com.tr4n.basedemo.screen.main

import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.tr4n.basedemo.R
import com.tr4n.basedemo.databinding.ActivityMainBinding
import com.tr4n.basedemo.screen.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResource get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun initComponents() {
        setupNavigation()
    }

    private fun setupNavigation() {
        val navController = findNavController(R.id.fragmentContent)
        bottomNavigation.setupWithNavController(navController)
    }

    override fun observeData() {
    }
}
