package com.developers1993.leetcode

class ReverseString {
    fun reverseString(s: String){
        if (s.isEmpty()){
            println("hmm that's not a valid string")
            return
        }
        val chars = s.toCharArray();
        var reverseString = "";
        chars.forEachIndexed { index, _ ->
            reverseString += chars[(chars.size-1)-index]
        }
        println(reverseString);
    }
}
fun main(){
    ReverseString().reverseString("Hi my name is Vipul")
}