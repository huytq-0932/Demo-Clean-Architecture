package com.tr4n.domain.repository

import com.tr4n.domain.entity.PhotoEntity

interface PhotoRepository {
    suspend fun getPhotos(keyword: String): List<PhotoEntity>
}
