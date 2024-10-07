package com.developers1993.leetcode

/***A factorial is when you multiply a number by all the numbers smaller than it, down to 1.
Example:
For 3! (read as "three factorial"):
You multiply: 3 × 2 × 1 = 6.
For 5!:
You multiply: 5 × 4 × 3 × 2 × 1 = 120.

And a special rule: 0! is always 1.

It’s like stacking blocks—each layer is built on top of the smaller ones!***/


class FactorialNumber {

    fun findFactorial(number : Int) : Int{
        return if (number==0 || number==1){
            1
        }else{
            number * findFactorial(number-1)
        }
    }

    fun findFactorial2(number: Int):Int{
        var result = 1
        for (i in  1..number){
            result *= i
        }
        return result
    }
}

fun main() {
    val factorial = FactorialNumber()
    val factorialValue = factorial.findFactorial(5)
    //val factorialValue = factorial.findFactorial2(5)
    print(factorialValue)

}