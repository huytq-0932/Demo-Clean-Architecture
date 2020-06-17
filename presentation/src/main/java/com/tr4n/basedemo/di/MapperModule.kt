package com.tr4n.basedemo.di

import com.tr4n.basedemo.mapper.PhotoModelMapper
import com.tr4n.basedemo.mapper.PresentationMapper
import com.tr4n.basedemo.model.PhotoModel
import com.tr4n.domain.entity.PhotoEntity
import org.koin.dsl.module

val mapperModule = module {
    single<PresentationMapper<PhotoEntity, PhotoModel>> {
        PhotoModelMapper()
    }
}
