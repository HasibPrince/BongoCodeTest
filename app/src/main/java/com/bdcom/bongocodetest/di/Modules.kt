package com.bdcom.bongocodetest.di

import com.bdcom.bongocodetest.data.VideoDataSource
import com.bdcom.bongocodetest.data.VideoRepository
import com.bdcom.bongocodetest.viewmodels.VideoPlayerViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val videoPlayer = module(override = true) {
    single { androidApplication().packageName }
    single { VideoDataSource(get()) }
    single { VideoRepository(get()) }
    viewModel { VideoPlayerViewModel(get()) }
}
