package com.bahasa.myuas.api

import com.bahasa.myuas.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {
    @GET("data.php")
    fun data() : Call<DataModel>
}