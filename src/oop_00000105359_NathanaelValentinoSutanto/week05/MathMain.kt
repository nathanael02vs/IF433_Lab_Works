package oop_00000105359_NathanaelValentinoSutanto.week05

fun main(){
    println("\n === TEST MATH HELPER ===")
    val math = MathHelper()
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (4 x 6): ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran (Jari-jari 7): ${math.hitungLuas(7.0)}")
}