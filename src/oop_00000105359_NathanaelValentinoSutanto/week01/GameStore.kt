package oop_00000105359_NathanaelValentinoSutanto.week01

fun main() {
    val gameTitle: String = "Zuma's Revenge"
    val price: Int = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    val noteText = userNote ?: "Tidak ada catatan"

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice, note = noteText)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price - (price * 20 / 100)
} else {
    price - (price * 10 / 100)
}

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String){
    println("=== STEAMKW RECEIPT ===")
    println("Title: $title")
    println("Price: $originalPrice")
    println("Final Price: $finalPrice")
    println("Note: $note")
    println("=======================")
}