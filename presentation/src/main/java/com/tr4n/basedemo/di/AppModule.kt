package com.tr4n.basedemo.di

import com.tr4n.data.scheduler.DefaultDispatcher
import com.tr4n.data.scheduler.IODispatcher
import com.tr4n.data.scheduler.MainDispatcher
import com.tr4n.domain.scheduler.AppDispatchers
import com.tr4n.domain.scheduler.DispatchersProvider
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    single<DispatchersProvider>(named(AppDispatchers.IO)) {
        IODispatcher()
    }
    single<DispatchersProvider>(named(AppDispatchers.DEFAULT)) {
        DefaultDispatcher()
    }
    single<DispatchersProvider>(named(AppDispatchers.MAIN)) {
        MainDispatcher()
    }
}
