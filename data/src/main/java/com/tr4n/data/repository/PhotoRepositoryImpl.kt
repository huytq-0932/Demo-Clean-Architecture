package com.tr4n.data.repository

import com.tr4n.data.model.Hit
import com.tr4n.data.repository.remote.PhotoDataSource
import com.tr4n.domain.entity.PhotoEntity
import com.tr4n.domain.repository.PhotoRepository

class PhotoRepositoryImpl(
    private val dataSource: PhotoDataSource
) : PhotoRepository {

    override suspend fun getPhotos(keyword: String): List<PhotoEntity> =
        dataSource.getPhotos(keyword).map(Hit::toEntity)
}