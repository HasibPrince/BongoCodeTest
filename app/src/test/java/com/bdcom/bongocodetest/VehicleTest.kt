package com.bdcom.bongocodetest

import com.bdcom.bongocodetest.vehicle.CarWithAC
import com.bdcom.bongocodetest.vehicle.VehicleFactory
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class VehicleTest {

    @Test
    fun testAcAvailabilityOnCar(){
        val acCar = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.CAR_WITH_AC) as CarWithAC
        assertNotNull(acCar.ac)
    }

    @Test
    fun testGasAvailabilityOnVehicle(){
        val plane = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.PLANE, 300)
        assertFalse(plane.hasGas())

        val car = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.CAR)
        assertTrue(car.hasGas())

        val acCar = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.CAR_WITH_AC)
        assertTrue(acCar.hasGas())
    }

    @Test
    fun testSeatsOfVehicle(){
        val plane = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.PLANE, 300)
        assertEquals(plane.getNumberOfPassangers(), 300)

        val car = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.CAR)
        assertEquals(car.getNumberOfPassangers(), 5)

        val acCar = VehicleFactory.buildVehicle(VehicleFactory.VEHICLE_TYPE.CAR_WITH_AC)
        assertEquals(acCar.getNumberOfPassangers(), 5)
    }
}
