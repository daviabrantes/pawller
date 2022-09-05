package com.example.pawller.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pawller.data.models.Dog

@Database(entities = [Dog::class], version = 1, exportSchema = false)
abstract class DogDatabase: RoomDatabase() {
    abstract fun dogDao(): DogDao
}