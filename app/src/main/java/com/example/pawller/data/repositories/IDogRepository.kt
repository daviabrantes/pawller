package com.example.pawller.data.repositories

import com.example.pawller.data.models.Dog
import kotlinx.coroutines.flow.Flow

interface IDogRepository {
    suspend fun getSelectedDog(dogId: Int): Flow<Dog>
    suspend fun addDog(dog: Dog)
}