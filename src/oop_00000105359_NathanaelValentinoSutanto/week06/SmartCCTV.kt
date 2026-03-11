package oop_00000105359_NathanaelValentinoSutanto.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] CCTV menyala dan mulai memantau area.")
        startRecord() // Otomatis mulai rekam saat dinyalakan
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan.")
    }

    override fun startRecord() {
        println("[$name] Rekaman dimulai...")
    }
}