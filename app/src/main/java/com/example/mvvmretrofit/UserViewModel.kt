package com.example.mvvmretrofit

import androidx.lifecycle.LiveData

//Communicate with repo and expose data to UI through LiveData
class UserViewModel {
    private val userRepository = UserRepository()

    fun getUsers(): LiveData<List<User>> {
        return userRepository.getUsers()
    }
}