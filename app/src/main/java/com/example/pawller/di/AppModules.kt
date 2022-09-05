package com.example.pawller.di

import androidx.room.Room
import com.example.pawller.data.DogDatabase
import com.example.pawller.utils.Constants.DATABASE_NAME
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {

    single {
        Room.databaseBuilder(
            androidApplication(),
            DogDatabase::class.java,
            DATABASE_NAME
        ).build()

        val appModule = module {
            val database = get<DogDatabase>()

            single { database.dogDao() }

            //single { DogRepository(get()) }

            //single { DogViewModel(get()) }
        }
    }
}