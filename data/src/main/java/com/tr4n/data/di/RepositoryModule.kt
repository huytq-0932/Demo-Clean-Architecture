package com.tr4n.data.di

import com.tr4n.data.repository.PhotoRepositoryImpl
import com.tr4n.data.repository.remote.PhotoDataSource
import com.tr4n.data.repository.remote.impl.PhotoRemoteDataSource
import com.tr4n.domain.repository.PhotoRepository
import org.koin.dsl.module

val repositoryModule = module {

    single<PhotoDataSource> {
        PhotoRemoteDataSource(api = get())
    }
    single<PhotoRepository> {
        PhotoRepositoryImpl(dataSource = get())
    }
}
