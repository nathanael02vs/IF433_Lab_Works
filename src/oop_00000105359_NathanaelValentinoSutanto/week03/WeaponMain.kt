package oop_00000105359_NathanaelValentinoSutanto.week03

fun main() {
    println("\n--- Test Weapon ---")
    val w = Weapon("Excalibur")

    w.damage = -50
    println("Damage setelah set -50: ${w.damage}")

    w.damage = 9999
    println("Damage setelah set 9999: ${w.damage}")

    println("Tier: ${w.tier}")
}