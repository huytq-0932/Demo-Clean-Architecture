package com.tr4n.data.repository.remote

import com.tr4n.data.model.Hit

interface PhotoDataSource {
    suspend fun getPhotos(keyword: String): List<Hit>
}