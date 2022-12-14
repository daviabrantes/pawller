package com.example.pawller

import android.app.Application
import com.example.pawller.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class PawllerApp: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger()
            androidContext(this@PawllerApp)
            modules(listOf(appModule))
        }
    }
}