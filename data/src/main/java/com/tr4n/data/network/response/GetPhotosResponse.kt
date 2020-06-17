package com.tr4n.data.network.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tr4n.data.model.Hit

data class GetPhotosResponse(
    @SerializedName("hits")
    @Expose
    val hits: List<Hit> = emptyList()
) : BaseResponse()
