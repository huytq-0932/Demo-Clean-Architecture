package com.tr4n.data.network.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

abstract class BaseResponse(
    @SerializedName("total")
    @Expose
    val total: Int = 0,
    @SerializedName("totalHits")
    @Expose
    val totalHit: Int = 0
)
