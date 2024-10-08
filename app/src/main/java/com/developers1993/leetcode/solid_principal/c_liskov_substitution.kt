package com.developers1993.leetcode.solid_principal

/**
 * 3. Liskov Substitution Principle (LSP)
 * Objects of a superclass should be replaceable with objects of a subclass
 * without affecting the functionality.
 * inShort a function that use base class should be able to use derived class
 * */

//LSP Violation Example:
open class Vehicle {
    open fun startEngine() {
        println("starting engine...")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("car engine starting")
    }
}

class Bicycle : Vehicle() {
    // Bicycle has no engine, violating LSP when calling startEngine
    //Substituting a Vehicle with a Bicycle breaks the functionality,
    // as we are expecting all vehicles to have engines
    // and thus can call startEngine().
    override fun startEngine() {
        throw UnsupportedOperationException("Bicycles don't have engines!")
    }
}

//Correct Example:
open class VehicleLSP {
    open fun move() {
        println("moving")
    }
}

open class MotorVehicle : VehicleLSP() {
    open fun startEngine() {
        println("starting engine")
    }
}

class CarLSP : MotorVehicle() {

    override fun startEngine() {
        println("car engine starting...")
    }
}

class BicycleLSP : VehicleLSP() {
    override fun move() {
        println("moving bicycle....")
    }
}


fun main() {

    val vehicles : List<VehicleLSP> = listOf(CarLSP(), BicycleLSP())
    for (vehicle in vehicles) {
        if (vehicle is CarLSP) {
            vehicle.startEngine()
        }else{
            vehicle.move()
        }
    }

}
