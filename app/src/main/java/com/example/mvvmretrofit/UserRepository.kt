package com.example.mvvmretrofit

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//Repository: fetch data from network: single source of data

class UserRepository {
    private val apiService = RetrofitClient.apiService

    fun getUsers(): LiveData<List<User>> {
        val usersLiveData = MutableLiveData<List<User>> ()

        apiService.getUsers().enqueue(object: Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>){
                if (response.isSuccessful){
                    usersLiveData.value = response.body()
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.d(TAG, "Failed ")
                usersLiveData.value = null
            }

        })
        return usersLiveData
    }

}