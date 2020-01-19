package com.bdcom.bongocodetest.data

class VideoRepository(private var dataSource: VideoDataSource) {
    fun getVideoPath(): String{
        return dataSource.getVideoPath()
    }
}