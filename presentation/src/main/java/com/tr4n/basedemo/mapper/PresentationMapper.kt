package com.tr4n.basedemo.mapper

import com.tr4n.basedemo.model.PresentationModel
import com.tr4n.domain.entity.BaseEntity

interface PresentationMapper<Entity : BaseEntity, PModel : PresentationModel> {
    fun toModel(entity: Entity): PModel
}
