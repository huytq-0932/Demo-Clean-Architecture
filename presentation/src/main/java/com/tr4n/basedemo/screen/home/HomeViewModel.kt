package com.tr4n.basedemo.screen.home

import androidx.lifecycle.LiveData
import com.tr4n.basedemo.model.PhotoModel
import com.tr4n.basedemo.screen.base.BaseViewModel
import com.tr4n.shared.livedata.SingleLiveEvent

class HomeViewModel : BaseViewModel() {

    private val _urls = SingleLiveEvent<List<PhotoModelItem>>()
    val urls: LiveData<List<PhotoModelItem>> get() = _urls

    fun getImageUrls() {

        val photoUrls = listOf(
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png",
            "https://1.bp.blogspot.com/-yu5450WFuQo/WBAy-bTSsGI/AAAAAAAAABM/SFA5RgVAGuUVB36iszP47aQWmdOsy3fgwCLcB/s400/luyen-small-talk.png"
        )

        _urls.value = photoUrls.map {
            PhotoModelItem(PhotoModel(it))
        }
        notifyChange()
    }

}
