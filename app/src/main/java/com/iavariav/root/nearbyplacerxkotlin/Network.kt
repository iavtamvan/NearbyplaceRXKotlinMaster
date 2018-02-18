package com.iavariav.root.nearbyplacerxkotlin

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory


/**
 * Created by root on 2/18/18.
 */
object Network {
    val BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/"

    var retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
}