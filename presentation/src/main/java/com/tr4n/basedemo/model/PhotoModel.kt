package com.tr4n.basedemo.model

import java.util.*

data class PhotoModel(
    val url: String,
    val id: String = UUID.randomUUID().toString()
)
