package com.iavariav.root.nearbyplacerxkotlin

import com.iavariav.root.nearbyplacerxkotlin.model.ResultsItem
import com.iavariav.root.nearbyplacerxkotlin.model.RootModels
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import java.util.*

/**
 * Created by root on 2/18/18.
 */
interface ApiService {
    @GET("json?location=-7.052346,110.4298528&radius=500&type=restaurant&keyword=warung&key=AIzaSyA9uk-FMtWZS8Ew2I1K9uTLmfFhDzTSKbo")
    fun getPlace(): Observable<RootModels>

}