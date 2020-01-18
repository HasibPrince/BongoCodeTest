package com.bdcom.bongocodetest.vehicle

open class Car : Vehicle {
    var hasGas = true

    override fun getNumberOfWheels(): Int {
        return 4
    }

    override fun getNumberOfPassangers(): Int {
        return 5
    }

    override fun hasGas(): Boolean {
        return hasGas
    }

}