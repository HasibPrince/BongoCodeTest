package com.bdcom.bongocodetest.player

interface Player {
    fun play()
    fun forward(millisToForward: Int)
    fun rewind(millisToReqind: Int)
}