package com.example.mydiary.data

import androidx.lifecycle.LiveData

class UserRepository(private val dataDao: DataDao) {
    val readAllData: LiveData<List<User>> = dataDao.readAllData()

    suspend fun addUser(user: User){
        dataDao.addUser(user)
    }
}