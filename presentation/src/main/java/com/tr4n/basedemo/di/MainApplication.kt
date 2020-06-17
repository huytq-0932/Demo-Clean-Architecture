package com.tr4n.basedemo.di

import android.app.Application
import com.tr4n.data.di.dataModule
import com.tr4n.data.di.repositoryModule
import com.tr4n.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(
                listOf(
                    appModule,
                    repositoryModule,
                    dataModule,
                    domainModule,
                    mapperModule,
                    viewModelModule
                )
            )
        }
    }
}
