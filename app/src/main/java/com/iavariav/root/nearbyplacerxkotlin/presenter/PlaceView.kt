package com.iavariav.root.nearbyplacerxkotlin.presenter

import com.iavariav.root.nearbyplacerxkotlin.model.ResultsItem

/**
 * Created by root on 2/18/18.
 */
interface PlaceView {

    fun berhasil(datas: List<ResultsItem?>?)

    fun noSucces(pesan : String)



}