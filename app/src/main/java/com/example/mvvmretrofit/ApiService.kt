package com.example.mvvmretrofit

import retrofit2.Call
import retrofit2.http.GET

//Retrofit interface: contract to define http operations that will be performed
interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<User>>
}