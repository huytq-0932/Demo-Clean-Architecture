package com.tr4n.basedemo.screen.home

import android.util.Log
import androidx.lifecycle.LiveData
import com.tr4n.basedemo.mapper.PresentationMapper
import com.tr4n.basedemo.model.PhotoModel
import com.tr4n.basedemo.screen.base.BaseViewModel
import com.tr4n.domain.entity.PhotoEntity
import com.tr4n.domain.usecase.UseCase
import com.tr4n.domain.usecase.GetPhotosUseCase
import com.tr4n.shared.livedata.SingleLiveEvent
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getPhotosUseCase: UseCase<GetPhotosUseCase.Input, List<PhotoEntity>>,
    private val mapper: PresentationMapper<PhotoEntity, PhotoModel>
) : BaseViewModel() {

    private val _urls = SingleLiveEvent<List<PhotoModelItem>>()
    val urls: LiveData<List<PhotoModelItem>> get() = _urls

    fun getPhotoUrls() {
        scope.launch {
            getPhotosUseCase(GetPhotosUseCase.Input("vietnam")) {
                onSubscribe {
                    _urls.value = emptyList()
                }
                onSuccess { photoEntities ->
                    val photos = photoEntities?.map(mapper::toModel) ?: emptyList()
                    _urls.value = photos.map {
                        PhotoModelItem(it)
                    }
                    notifyChange()
                }
                onError {
                    _messageToast.value = it.toString()
                    Log.e("HomeViewModel", "Error: $it")
                }
            }
//        }
//
//        val photoUrls = listOf(
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
//            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png"
//        )
//
//        _urls.value = photoUrls.map {
//            PhotoModelItem(PhotoModel(it))
//        }

        }
    }
}
