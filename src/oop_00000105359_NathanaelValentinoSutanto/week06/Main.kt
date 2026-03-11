package oop_00000105359_NathanaelValentinoSutanto.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // DYnamic polymorphism in action
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    val lamp = SmartLamp(id = "SL-001", name = "Lampu Ruang Tamu")
    val speaker = SmartSpeaker(id = "SS-001", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "SC-001", name = "Ezviz Garasi")
}