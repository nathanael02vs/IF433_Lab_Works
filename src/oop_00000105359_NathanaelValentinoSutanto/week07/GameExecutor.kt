package oop_00000105359_NathanaelValentinoSutanto.week07

fun processEvent(event: BattleState){
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap untuk bertarung!")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot ditemukan: $name (Damage: $damage, Rarity: $rarity)")
        }
        is BattleState.GameOver -> {
            println("GAME OVER: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman.")
        }
    }
}