package oop_00000105359_NathanaelValentinoSutanto.week06

class Button(override val name: String): Clickable {
    override fun click(){
        println("Tombol '$name' nerhasil diklik!")
    }
}