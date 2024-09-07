package com.developers1993.leetcode

/***
 * A palindrome is something that reads the same forward and backward
 * (e.g., "121", "racecar", "madam").
 * **/
class PalindromeNumber {

    //for integer
    fun isPalindrome(number: Int) :Boolean{
        if (number<0) return false

        var original = number
        var reversed = 0

        while (original!=0){
            val lastDigit = original%10
            reversed = reversed * 10 + lastDigit
            original /= 10
        }
        return number == reversed
    }

    //for string
    fun isPalindrome(input:String):Boolean{
        return  (input.isNotEmpty() && input.reversed() == input)
    }

    //other approach Two-pointer technique
    fun isPalindromeStringAlternative(str: String): Boolean {
        val lowerStr = str.lowercase()  // Convert to lowercase for case-insensitivity
        var left = 0
        var right = lowerStr.length - 1

        while (left < right) {
            if (lowerStr[left] != lowerStr[right]) {
                return false  // If mismatch found, it's not a palindrome
            }
            left++
            right--
        }

        return true  // If no mismatches, it's a palindrome
    }

}

fun main() {
    val palindromeNumber = PalindromeNumber()
   val result =  palindromeNumber.isPalindrome(121)
   val resultString =  palindromeNumber.isPalindrome("SMS")
   val resultStringOther =  palindromeNumber.isPalindromeStringAlternative("seeyou")

    println(result)
    println(resultString)
    println(resultStringOther)
}