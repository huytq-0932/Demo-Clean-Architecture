package com.tr4n.basedemo.screen.primary

import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.tr4n.basedemo.R
import com.tr4n.basedemo.base.BaseFragment
import com.tr4n.basedemo.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class PrimaryFragment : BaseFragment<FragmentMainBinding, PrimaryViewModel>() {
    override val layoutResource get() = R.layout.fragment_main
    override val viewModel: PrimaryViewModel by viewModel()

    override fun setUpView() {
        setupNavigation()
    }

    private fun setupNavigation() {
        activity?.run{
            val navController =  Navigation.findNavController(this, R.id.fragmentContent)
            NavigationUI.setupWithNavController(bottomNavigation, navController)
            bottomNavigation.setupWithNavController(navController)
        }
    }
}
