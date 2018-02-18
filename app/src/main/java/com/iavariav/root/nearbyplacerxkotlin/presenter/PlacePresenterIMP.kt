package com.iavariav.root.nearbyplacerxkotlin.presenter

import android.util.Log
import com.iavariav.root.nearbyplacerxkotlin.Network
import com.iavariav.root.nearbyplacerxkotlin.model.ResultsItem
import com.iavariav.root.nearbyplacerxkotlin.model.RootModels
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by root on 2/18/18.
 */
class PlacePresenterIMP : PlacePresenter {

    var placeView : PlaceView? = null
    var data : List<ResultsItem>? = null

    constructor(placeView: PlaceView?) {
        this.data = data
        this.placeView = placeView
    }

    override fun listPlace() {
        Network.service.getPlace().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    t: RootModels? -> Log.d("data server : ", t?.results.toString())
                    var hasil = t?.results

                    placeView?.berhasil(hasil)
                },{
                    e -> Log.d("error", e.localizedMessage)
                })
    }


//    override fun listPlace(nama: String, alamat: String, rating: String) {
//        var model = ResultsItem(nama, alamat ,rating)
//
//        data?.add(model)
//
//        placeView?.berhasil(data!!)
//    }
}