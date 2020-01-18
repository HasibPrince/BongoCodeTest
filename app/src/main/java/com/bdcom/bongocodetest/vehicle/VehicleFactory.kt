package com.bdcom.bongocodetest.vehicle

object VehicleFactory {
    enum class VEHICLE_TYPE { CAR, CAR_WITH_AC, PLANE }

    fun buildVehicle(vehicleType: VEHICLE_TYPE, numberOfPassengers: Int = 5): Vehicle {
        return when (vehicleType) {
            VehicleFactory.VEHICLE_TYPE.CAR -> {
                Car()
            }

            VehicleFactory.VEHICLE_TYPE.CAR_WITH_AC -> {
                AcCarBuilder.addAc()
                    .build()
            }

            VehicleFactory.VEHICLE_TYPE.PLANE -> {
                Plane(numberOfPassengers)
            }


        }
    }
}