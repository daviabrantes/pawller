package com.example.pawller.data

import androidx.room.*
import com.example.pawller.data.models.Dog
import kotlinx.coroutines.flow.Flow

@Dao
interface DogDao {

    @Query("SELECT * FROM dog_table ORDER BY id ASC")
    fun getAllDogs(): Flow<List<Dog>>

    @Query("SELECT * FROM dog_table WHERE id=:dogId")
    fun getSelectedDog(dogId: Int): Flow<Dog>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addDog(dog: Dog)

    @Update
    suspend fun updateDog(dog: Dog)

    @Delete
    suspend fun deleteDog(deleteDog: Dog)

    @Query("DELETE FROM dog_table")
    suspend fun deleteAllDogs()

    @Query("SELECT * FROM dog_table WHERE name LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<Dog>>

    @Query(
        """
        SELECT * FROM dog_table ORDER BY
    CASE
        WHEN size LIKE 'VERY_L%' THEN 1
        WHEN size LIKE 'L%' THEN 2
        WHEN size LIKE 'M%' THEN 3
        WHEN size LIKE 'S%' THEN 4
        WHEN size LIKE 'VERY_S%' THEN 5
    END
    """
    )
    fun sortByLargerSize(): Flow<List<Dog>>

    @Query(
        """
        SELECT * FROM dog_table ORDER BY
    CASE
        WHEN size LIKE 'VERY_S%' THEN 1
        WHEN size LIKE 'S%' THEN 2
        WHEN size LIKE 'M%' THEN 3
        WHEN size LIKE 'L%' THEN 4
        WHEN size LIKE 'VERY_L%' THEN 5
    END
    """
    )
    fun sortBySmallerSize(): Flow<List<Dog>>
}