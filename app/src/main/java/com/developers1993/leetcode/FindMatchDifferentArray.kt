package com.developers1993.leetcode

class FindMatchDifferentArray {

    //O(n^2) time complexity
    fun solution1(arr1: Array<String>, arr2: Array<String>):Boolean {
        for (item in arr1){ //O(n)
            for (match in arr2){ //*O(N)
                if (item == match){//O(1)
                    return true//O(1)
                }
            }
        }
        return false//O(1)
        //O(N)*O(N)+O(1)+O(1) loop within loop will be consider as (*) out side will be consider as (+)
        //O(O^2)
    }

    //O(n) complexity
    fun solution2(arr1: Array<String>, arr2: Array<String>):Boolean {
        val keys = mutableMapOf<String,Boolean>()
        arr1.forEach { item1 ->
            if (!keys.contains(item1)){
                keys[item1] = true
            }
        }
        arr2.forEach { item2->
            if (keys.contains(item2)){
                return true
            }
        }
        return false
    }
}
