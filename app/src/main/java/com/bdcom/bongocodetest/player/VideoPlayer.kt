package com.bdcom.bongocodetest.player

import android.media.MediaPlayer

class VideoPlayer(var mediaPlayer: MediaPlayer) : Player {

    companion object{
        fun getInstance(mediaPlayer: MediaPlayer): VideoPlayer {
            return VideoPlayer(mediaPlayer)
        }
    }

    override fun play() {
        mediaPlayer.start()
    }

    override fun forward(millisToForward: Int) {
        mediaPlayer.seekTo(mediaPlayer.currentPosition + millisToForward)
    }

    override fun rewind(millisToRewind: Int) {
        mediaPlayer.seekTo(mediaPlayer.currentPosition - millisToRewind)
    }
}