import com.developers1993.leetcode.FindMatchDifferentArray

fun main() {
    val arr1 = arrayOf("a", "b", "d", "d", "e")
    val arr2 = arrayOf("f", "adsd", "r", "c")

    val findMatchDifferentArray = FindMatchDifferentArray()
    //println(findMatchDifferentArray.solution1(arr1, arr2))
    //println(findMatchDifferentArray.solution2(arr1, arr2))
    println(findMatchDifferentArray.solution3(arr1, arr2))

}

