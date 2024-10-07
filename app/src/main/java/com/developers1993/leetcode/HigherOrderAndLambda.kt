package com.developers1993.leetcode

val sum: (Int, Int) -> Int = { a, b -> a + b }
val subtraction: (Int, Int) -> Int = { a, b -> a - b }

fun summ(a:Int,b:Int):Int{
    return a+b
}

fun hello(myFunc: (Int, Int) -> Int, a: Int, b: Int) {
    println(myFunc(a, b))
}

fun main() {

    hello(::summ, 10, 20)
    hello(subtraction, 30, 20)

    //println(sum(10,20))
    //println(subtraction(30,20))
}