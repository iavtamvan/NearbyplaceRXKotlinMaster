package com.iavariav.root.nearbyplacerxkotlin.model

import com.google.gson.annotations.SerializedName

data class RootModels(

	@field:SerializedName("html_attributions")
	val htmlAttributions: List<Any?>? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)