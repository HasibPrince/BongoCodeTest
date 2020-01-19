package com.bdcom.bongocodetest.viewmodels

import android.media.MediaPlayer
import android.net.Uri
import androidx.lifecycle.ViewModel
import com.bdcom.bongocodetest.data.VideoRepository
import com.bdcom.bongocodetest.player.VideoPlayer

class VideoPlayerViewModel(var repository: VideoRepository) : ViewModel() {

    private  var videoPlayer: VideoPlayer? = null

    fun initVideoPlayer(mediaPlayer: MediaPlayer){
        videoPlayer = VideoPlayer(mediaPlayer)
    }

    fun getVideoPath(): Uri {
        return Uri.parse(repository.getVideoPath())
    }

    /**
     *  plays the video
     */

    fun play(){
        videoPlayer?.play()
    }

    /**
     * rewind videos for 5 seconds
     */
    fun rewind(){
        videoPlayer?.rewind(5000)
    }

    /**
     * forward videos for seconds
     */
    fun forward(){
        videoPlayer?.forward(5000)
    }
}