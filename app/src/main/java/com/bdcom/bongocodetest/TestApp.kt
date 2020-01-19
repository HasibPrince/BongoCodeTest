package com.bdcom.bongocodetest

import android.app.Application
import com.bdcom.bongocodetest.di.videoPlayer
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TestApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TestApp)
            modules(videoPlayer)
        }
    }
}