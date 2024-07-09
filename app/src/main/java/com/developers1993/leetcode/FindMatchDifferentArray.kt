package com.developers1993.leetcode

class FindMatchDifferentArray {

    //O(n^2) time complexity
    fun solution1(arr1: Array<String>, arr2: Array<String>): Boolean {
        for (item in arr1) { //O(n)
            for (match in arr2) { //*O(N)
                if (item == match) {//O(1)
                    return true//O(1)
                }
            }
        }
        return false//O(1)
        //O(N)*O(N)+O(1)+O(1) loop within loop will be consider as (*) out side will be consider as (+)
        //O(O^2)
    }

    //O(n) complexity
    fun solution2(arr1: Array<String>, arr2: Array<String>): Boolean {
        val keys = mutableMapOf<String, Boolean>() // creating new object which will add more space
        arr1.forEach { item1 ->//O(n)
            if (!keys.contains(item1)) {//O(1)
                keys[item1] = true//O(1) average
            }
        }
        arr2.forEach { item2 -> //O(m)
            if (keys.contains(item2)) {//O(1) average
                return true//O(1)
            }
        }
        return false//O(1)
        //O(n)+O(1)+O(1)+O(m)+O(1)+O(1)
        //O(n)

    }

    fun solution3(arr1: Array<String>, arr2: Array<String>): Boolean {
        return arr2.any { item -> item in arr1 }
    }
}
