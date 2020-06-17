package com.tr4n.domain.entity

data class PhotoEntity(
    val id: Int = 0,
    val tags: String = "",
    val url: String = ""
) : BaseEntity()
