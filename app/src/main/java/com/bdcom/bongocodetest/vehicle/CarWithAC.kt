package com.bdcom.bongocodetest.vehicle

class CarWithAC(var ac: Ac) : Car() {

    fun startAc() {
        ac.start()
    }

    fun stopAc() {
        ac.stop()
    }
}