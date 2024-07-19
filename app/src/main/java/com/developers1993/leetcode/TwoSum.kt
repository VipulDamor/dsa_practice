package com.developers1993.leetcode

class TwoSum {
    fun twoSum(num: IntArray, target: Int): IntArray {
        num.forEachIndexed { position, number ->
            num.forEachIndexed{ index, i ->
                val totalSum = number + i
                if (totalSum == target && position!=index){
                    return intArrayOf(position,index)
                }
            }
        }
        return intArrayOf()
    }
}

fun main(){
    println(TwoSum().twoSum(intArrayOf(3,2,4),6).toList())
}