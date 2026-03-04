package oop_00000105359_NathanaelValentinoSutanto.week05

fun main(){
    println("\n=== TEST PAYMENT SYSTEM ===")
    val ewallet = EWallet("Nathan GOPAY", 50000.0)
    val cc = CreditCard("Nathan BCA", 100000.0)

    val daftarPayment: List<PaymentMethod> = listOf(ewallet, cc)

    for (payment in daftarPayment) {
        payment.processPayment(75000.0)
        println("-------------------------")
    }
}