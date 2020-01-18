package com.bdcom.bongocodetest.vehicle

object AcCarBuilder {
    private lateinit var ac: Ac

    fun addAc(): AcCarBuilder {
        ac =
            createAc()
        return this
    }

    fun build(): CarWithAC {
        return CarWithAC(ac)
    }


    private fun createAc(): Ac {
        return object : Ac {
            override fun start() {
            }

            override fun stop() {
            }

        }
    }
}