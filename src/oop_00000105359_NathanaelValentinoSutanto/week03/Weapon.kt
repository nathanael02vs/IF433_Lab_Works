package oop_00000105359_NathanaelValentinoSutanto.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("PERINGATAN: Damage tidak boleh negatif! Nilai tidak diubah.")
                //Field tidak berubah
            } else if (value > 1000) {
                println("PERINGATAN: Damage terlalu besar (Overpowered)! Di-set ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}