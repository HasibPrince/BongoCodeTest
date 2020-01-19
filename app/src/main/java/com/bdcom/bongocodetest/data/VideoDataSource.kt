package com.bdcom.bongocodetest.data

import com.bdcom.bongocodetest.R

class VideoDataSource(var packageName: String) {

    fun getVideoPath(): String{
        return "android.resource://" + packageName + "/" + R.raw.one_min_timer
    }
}