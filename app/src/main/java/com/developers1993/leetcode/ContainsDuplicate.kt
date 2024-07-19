package com.developers1993.leetcode

class ContainsDuplicate {


    fun solution(num: IntArray): Boolean {
        val itemSet = mutableSetOf<Int>()
        num.forEach { item->
            if (itemSet.contains(item)){
                return true
            }else{
                itemSet.add(item)
            }
        }
        return false
    }
}

fun main(){
    println(ContainsDuplicate().solution(intArrayOf(1,2,3,1)))
}