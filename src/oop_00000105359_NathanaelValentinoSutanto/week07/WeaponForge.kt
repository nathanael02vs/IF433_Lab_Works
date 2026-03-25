package oop_00000105359_NathanaelValentinoSutanto.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            println("Menempa Starter Sword...")
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Api Legendaris", 150, ItemRarity.EPIC)
            println("Menempa Epic Sword...")
            return Weapon(item, 200)
        }
    }

}