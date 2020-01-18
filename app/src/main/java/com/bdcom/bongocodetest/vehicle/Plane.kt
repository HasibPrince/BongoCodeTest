package com.bdcom.bongocodetest.vehicle

class Plane(var numberOfPassengers: Int) : Vehicle {

    override fun getNumberOfWheels(): Int {
        return 3
    }

    override fun getNumberOfPassangers(): Int {
        return numberOfPassengers
    }

    override fun hasGas(): Boolean {
        return false
    }
}