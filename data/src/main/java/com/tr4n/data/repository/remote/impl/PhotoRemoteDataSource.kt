package com.tr4n.data.repository.remote.impl

import com.tr4n.data.model.Hit
import com.tr4n.data.network.AppApi
import com.tr4n.data.repository.remote.PhotoDataSource

class PhotoRemoteDataSource(
    private val api: AppApi
) : PhotoDataSource {

    override suspend fun getPhotos(keyword: String): List<Hit> =
        api.getPhotos(keyword).hits
}