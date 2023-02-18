package com.akash.acronymesearch.data.api

import com.akash.acronymesearch.domain.models.AcronymModel
import retrofit2.http.GET
import retrofit2.http.Query

interface AcronymApi {
    @GET("dictionary.py")
    suspend fun getMeanings(@Query("sf") acronym: String): List<AcronymModel>
}