package com.developers1993.leetcode.solid_principal

/**
 * 4. Interface Segregation Principle (ISP)
 * Clients should not be forced to depend on
 * Interface methods or methods they do not use
 * */

//todo Violation of ISP: All animals must implement both methods,
// even if they don't swim.
interface Animal{
    fun swim()
    fun fly()
}

class Fish : Animal{
    override fun swim() {

    }

    override fun fly() { // violation obviously cow can't fly -:)
    }

}



//todo Correct way: Separate interfaces for specific behaviors.
interface Flyable{
    fun fly()
}
interface Swimmable{
    fun swim()
}

class BirdISP:Flyable{
    override fun fly() {
        println("yeee i am flying")
    }
}

class FishISP : Swimmable{
    override fun swim() {
        println("swimming..")
    }

}

fun main(){
    val bird = BirdISP()
    val fish = FishISP()

    bird.fly()
    fish.swim()

}