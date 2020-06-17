package com.tr4n.data.model

import com.tr4n.domain.entity.BaseEntity

interface MapAbleData<Entity : BaseEntity> {
    fun toEntity(): Entity
}
