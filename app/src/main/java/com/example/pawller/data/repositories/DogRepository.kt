package com.example.pawller.data.repositories

import com.example.pawller.data.DogDao
import com.example.pawller.data.models.Dog
import kotlinx.coroutines.flow.Flow

class DogRepository(private val dogDao: DogDao): IDogRepository {

    override suspend fun getSelectedDog(dogId: Int): Flow<Dog> {
        return dogDao.getSelectedDog(dogId = dogId)
    }

    override suspend fun addDog(dog: Dog) {
        dogDao.addDog(dog = dog)
    }
}