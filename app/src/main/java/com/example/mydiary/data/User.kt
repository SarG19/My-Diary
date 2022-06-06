package com.example.mydiary.data

import android.os.Parcelable
import android.provider.ContactsContract
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "data_table")
data class User(
    @PrimaryKey
    val Title: String,
    val Note: String): Parcelable