package oop_00000105359_NathanaelValentinoSutanto.week03

fun main(){
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan meledakkan program
}