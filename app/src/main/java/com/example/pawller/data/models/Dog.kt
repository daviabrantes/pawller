package com.example.pawller.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pawller.utils.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class Dog(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val description: String,
    val size: Size,
    val image: String
)