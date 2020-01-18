package com.bdcom.bongocodetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bdcom.bongocodetest.player.VideoPlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var videoPlayer: VideoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        videoView.setOnPreparedListener {
            videoPlayer = VideoPlayer.getInstance(it)
        }
    }
}
