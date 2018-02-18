package com.iavariav.root.nearbyplacerxkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.iavariav.root.nearbyplacerxkotlin.model.ResultsItem
import com.iavariav.root.nearbyplacerxkotlin.presenter.PlacePresenterIMP
import com.iavariav.root.nearbyplacerxkotlin.presenter.PlaceView
import com.iavariav.root.recyclerviewmvpkotlin.adapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PlaceView {


    lateinit var placePresenterIMP: PlacePresenterIMP
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initVIew()

//        Network.service.getPlace().subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe({
//                    t: RootModels? -> Log.d("data server : ", t?.results.toString())
//                    var data = t?.results
//
//
//                },{
//                    e -> Log.d("error", e.localizedMessage)
//                })

//        Network.service.getTempat().subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe({
//                    t: ResponseBody? ->
//                    val jsonObject = JSONObject(t.body()!!.string())
//                },{
//                    Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show()
//                })
    }

    private fun initVIew() {
        placePresenterIMP.listPlace()
    }

    private fun initPresenter() {
        placePresenterIMP = PlacePresenterIMP(this)
    }

    override fun berhasil(datas: List<ResultsItem?>?) {
        var adapter = RecyclerViewAdapter(datas)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)

    }

    override fun noSucces(pesan: String) {
    }
}
