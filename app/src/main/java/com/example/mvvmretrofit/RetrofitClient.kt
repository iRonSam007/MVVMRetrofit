package com.example.mvvmretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Provide the retrofit instance
object RetrofitClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: ApiService = retrofit.create(ApiService::class.java)
}