package oop_00000105359_NathanaelValentinoSutanto.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}