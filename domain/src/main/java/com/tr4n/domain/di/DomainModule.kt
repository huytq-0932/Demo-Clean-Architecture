package com.tr4n.domain.di

import com.tr4n.domain.entity.PhotoEntity
import com.tr4n.domain.usecase.UseCase
import com.tr4n.domain.usecase.GetPhotosUseCase
import org.koin.dsl.module

val domainModule = module {
    factory<UseCase<GetPhotosUseCase.Input, List<PhotoEntity>>> {
        GetPhotosUseCase(photoRepository = get())
    }
}
