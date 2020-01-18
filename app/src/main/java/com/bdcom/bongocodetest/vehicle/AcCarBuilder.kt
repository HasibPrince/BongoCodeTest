package com.bdcom.bongocodetest.vehicle

object AcCarBuilder {
    private lateinit var ac: Ac

    fun addAc(ac: Ac): AcCarBuilder {
        this.ac = ac
        return this
    }

    fun build(): CarWithAC {
        return CarWithAC(ac)
    }
}