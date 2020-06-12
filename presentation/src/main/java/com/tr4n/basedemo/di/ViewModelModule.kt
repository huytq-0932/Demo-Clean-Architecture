package com.tr4n.basedemo.di

import com.tr4n.basedemo.screen.explore.FavoriteViewModel
import com.tr4n.basedemo.screen.favorite.ExploreViewModel
import com.tr4n.basedemo.screen.home.HomeViewModel
import com.tr4n.basedemo.screen.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel()
    }
    viewModel {
        HomeViewModel()
    }
    viewModel {
        ExploreViewModel()
    }
    viewModel {
        FavoriteViewModel()
    }
}
