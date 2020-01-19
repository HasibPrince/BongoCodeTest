package com.bdcom.bongocodetest

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bdcom.bongocodetest.player.VideoPlayer
import com.bdcom.bongocodetest.viewmodels.VideoPlayerViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.KoinComponent

class MainActivity : AppCompatActivity(), KoinComponent {

    private val viewModel: VideoPlayerViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        videoView.setOnPreparedListener {
            viewModel.initVideoPlayer(it)
            viewModel.play()
        }
        videoView.setVideoURI(viewModel.getVideoPath())

        play.setOnClickListener {
            viewModel.play()
        }
        rewind.setOnClickListener {
            viewModel.rewind()
        }

        forward.setOnClickListener {
            viewModel.forward()
        }
    }
}
