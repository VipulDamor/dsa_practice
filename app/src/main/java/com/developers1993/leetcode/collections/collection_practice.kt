package com.developers1993.leetcode.collections

val list = listOf(1, 2, 3, 4, 5, 2)
val nestedList = listOf(
    listOf(1, 2, 3),
    listOf(4, 5),
    listOf(6, 7, 8, 9, list),
    list
)

fun main() {



    val map = list.map { it * it }
    val filter = list.filter { it == 2 }

    val reduce = list.reduce { stored, second ->
        println(" reduce $stored  :  $second")
        stored + second
    }
    val fold = list.fold(initial = 0) { stored, second ->
        println(" fold $stored  :  $second")
        stored + second
    }
    val flatmap = nestedList.flatten()
    val groupBy = list.groupBy { it }
    val groupBy2 = list.groupBy { if (it % 2 == 0) "Even" else "Odd" }

    val (partition1, partition2) = list.partition { it==1 }
    val (evenNumbers, oddNumbers) = list.partition { it % 2 == 0 }


    println("------------ Result  --------------")
    println("list : $list")
    println("map : $map")
    println("filter :  $filter")
    println("reduce :  $reduce")
    println("fold :  $fold")
    println("flatmap :  $flatmap")
    println("groupBy :  $groupBy")
    println("groupBy2 :  $groupBy2")
    println("partition : $evenNumbers :  $oddNumbers")
    println("partition : $partition1 :  $partition2")

}