package com.tr4n.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tr4n.domain.entity.PhotoEntity

data class Hit(
    @SerializedName("id")
    @Expose
    val id: Int = 0,
    @SerializedName("tags")
    @Expose
    val tags: String = "",
    @SerializedName("previewURL")
    @Expose
    val url: String = ""
): BaseData(), MapAbleData<PhotoEntity> {

    override fun toEntity() = PhotoEntity(id, tags, url)
}
