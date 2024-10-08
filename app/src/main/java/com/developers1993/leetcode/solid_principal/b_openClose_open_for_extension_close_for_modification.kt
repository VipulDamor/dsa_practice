package com.developers1993.leetcode.solid_principal


/**
 * 2. Open/Closed Principle (OCP)
 * Classes should be open for extension but closed for modification.
* */


//Violation of OpenClosePrincipal:
// Changing this class directly to add new discount logic.

class PriceCalculator {
    fun calculatePrice(price: Double, discountType: String): Double {
        return when (discountType) {
            "basic" -> {
                price * 0.9
            }
            "premium" -> {
                price * 0.5
            }
            else -> {
                price
            }
        }
    }
}


//Correct way:
// Extend functionality without modifying the existing code.
interface Discount{
    fun applyDiscount(basePrice:Double):Double
}

class BasicDiscount:Discount{
    override fun applyDiscount(basePrice: Double):Double {
        return basePrice*0.9
    }
}
class PremiumDiscount : Discount{
    override fun applyDiscount(basePrice: Double): Double {
        return basePrice*0.5
    }
}

class PriceCalculatorOC{
    fun calculatePrice(basePrice: Double,discount: Discount):Double{
        return discount.applyDiscount(basePrice)
    }
}

fun main(){
    val priceCalculator = PriceCalculatorOC()
    val price = priceCalculator.calculatePrice(100.00,BasicDiscount())
    println("Final Price: $price")  // Output: Final Price: 90.0

}

