package oop_00000105359_NathanaelValentinoSutanto.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double){
        println("Contacting Back for Rp$amount")
    }
}