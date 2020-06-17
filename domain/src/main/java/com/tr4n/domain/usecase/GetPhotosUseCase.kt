package com.tr4n.domain.usecase

import com.tr4n.domain.entity.PhotoEntity
import com.tr4n.domain.interactor.inputport.BaseInput
import com.tr4n.domain.repository.PhotoRepository

class GetPhotosUseCase(
    private val photoRepository: PhotoRepository
) : UseCase<GetPhotosUseCase.Input, List<PhotoEntity>>() {

    override suspend fun buildUseCase(input: Input): List<PhotoEntity> =
        photoRepository.getPhotos(input.keyword)

    class Input(val keyword: String) : BaseInput()
}
