package com.example.mvvmretrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

//Communicate with repo and expose data to UI through LiveData
class UserViewModel: ViewModel() {
    private val userRepository = UserRepository()

    fun getUsers(): LiveData<List<User>> {
        return userRepository.getUsers()
    }
}