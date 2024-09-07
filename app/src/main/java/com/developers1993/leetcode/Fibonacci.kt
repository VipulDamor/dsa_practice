package com.developers1993.leetcode

/**
 * What is the Fibonacci Sequence?
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1. The sequence looks like this:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * **/
class Fibonacci {

    //iterative way
    fun generateFibonacci(number: Int) {
        var first = 0
        var second = 1

        if (number >= 1) {
            print("$first ")
        }
        for (i in 2 .. number) {
            print("$second ")
            val next = first + second
            first = second
            second = next

        }

    }

    //recursive way
    private fun fibRec(n:Int):Int{
        if (n<=1) return n
        return fibRec(n-1)+fibRec(n-2)
    }

    fun printFibRec(number:Int){
        println()

        for (i in 0 until  number){
            print("${fibRec(i)} ")
        }
    }

}

fun main() {
    val fib = Fibonacci()
    fib.generateFibonacci(1)
    fib.printFibRec(1)
}