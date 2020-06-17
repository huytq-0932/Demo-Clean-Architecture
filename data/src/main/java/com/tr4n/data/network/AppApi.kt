package com.tr4n.data.network

import com.tr4n.data.network.response.GetPhotosResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface AppApi {

    @GET("api")
    suspend fun getPhotos(
        @Query("q") keyword: String
    ): GetPhotosResponse
}
