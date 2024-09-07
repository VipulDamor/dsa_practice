package com.developers1993.leetcode

import kotlin.math.sqrt



/***
 * A prime number is a number that can only be divided by 1 and itself.
 * That means it has no other divisors (numbers that go into it evenly).
 *
 * Examples of Prime Numbers:
 * 2, 3, 5, 7, 11, 13, 17...
 * Simple Rules:
 * 2 is the only even prime number.
 * A prime number must be greater than 1.
 * Example:
 * 5 is a prime number because you can only divide it by 1 and 5.
 * 6 is not a prime number because you can divide it by 1, 2, 3, and 6.
 *
 * ***/

class PrimeNumber {
    fun checkPrimeNumber(number: Int): Boolean {
        if (number < 2) return false
        if (number == 2) return true

        // Check divisibility from 2 to num - 1
        for (i in 2..<number) {  //for(i in 3 until number){  //both same approach
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

    fun getListOfPrimeNumbersBetween(range: Int) {
        for (i in 0 until range) {
            if (checkPrimeNumber(i)) {
                print("$i,")
            }
        }

    }
}

//we are creating extension function here
fun PrimeNumber.improvedIsPrimeNumber(num: Int): Boolean {
    if (num < 2) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    for (i in 3..sqrt(num.toDouble()).toInt() step 2){
        if (num % i == 0){
            return false
        }
    }
    return true
}

//we are creating extension function here
fun PrimeNumber.improvedGetListOfPrimeNumbersBetween(number: Int){

    val primeNumbers  = StringBuilder()

    for (i in 2 .. number){
        if (improvedIsPrimeNumber(i)){
            primeNumbers.append("$i,")
        }
    }
    //this will remove last comma ","
    if (primeNumbers.isNotEmpty()){
        primeNumbers.setLength(primeNumbers.length-1)
    }
    print(primeNumbers)
}

fun main() {
    val primeNumber = PrimeNumber()
    // println(PrimeNumber().checkPrimeNumber(4))

    //primeNumber.getListOfPrimeNumbersBetween(32)
    primeNumber.improvedGetListOfPrimeNumbersBetween(5)
}