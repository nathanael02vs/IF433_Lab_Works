package oop_00000105359_NathanaelValentinoSutanto.week01

fun main() {
    val gameTitle: String = "Zuma's Revenge"
    val price: Int = 750000

    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price - (price * 20 / 100)
} else {
    price - (price * 10 / 100)
}

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int){
    println("=== STEAMKW RECEIPT ===")
    println("Title: $title")
    println("Price: $originalPrice")
    println("Final Price: $finalPrice")
    println("=======================")
}