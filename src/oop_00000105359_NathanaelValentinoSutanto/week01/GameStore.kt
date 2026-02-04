package oop_00000105359_NathanaelValentinoSutanto.week01

fun main() {
    val gameTitle: String = "Zuma's Revenge"
    val price: Int = 750000

    val finalPrice = calculateDiscount(price)

}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price - (price * 20 / 100)
} else {
    price - (price * 10 / 100)
}