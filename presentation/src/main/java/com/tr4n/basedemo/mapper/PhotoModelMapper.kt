package com.tr4n.basedemo.mapper

import com.tr4n.basedemo.model.PhotoModel
import com.tr4n.domain.entity.PhotoEntity

class PhotoModelMapper : PresentationMapper<PhotoEntity, PhotoModel> {
    override fun toModel(entity: PhotoEntity) = PhotoModel(id = entity.id.toString(), url = entity.url)
}
