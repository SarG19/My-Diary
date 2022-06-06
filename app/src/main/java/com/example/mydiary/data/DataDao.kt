package com.example.mydiary.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DataDao {

    @Insert
    fun addUser(user: User)

    @Query("SELECT * FROM data_table")
    fun readAllData(): LiveData<List<User>>
}