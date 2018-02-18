package com.iavariav.root.recyclerviewmvpkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iavariav.root.nearbyplacerxkotlin.R
import com.iavariav.root.nearbyplacerxkotlin.model.ResultsItem

import kotlinx.android.synthetic.main.row_list.view.*

/**
 * Created by root on 2/17/18.
 */
class RecyclerViewAdapter(data: List<ResultsItem?>?) : RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>() {

    var ambilData : List<ResultsItem?>?
    init {
        ambilData = data
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {
        var view =LayoutInflater.from(parent?.context).inflate(R.layout.row_list, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return ambilData?.count()!!
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.bind(ambilData?.get(position))
    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(ambilData: ResultsItem?) {
            itemView.tvNama.text = ambilData?.name

            try {
                itemView.rt.rating = ambilData?.rating?.toFloat()!!
            } catch (e : Exception){

            }
            itemView.tvAlamat.text = ambilData?.vicinity
        }

    }

}