package oop_00000105359_NathanaelValentinoSutanto.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage)
    var enemyHp = 100

    println("\nBattle dimulai! Enemy HP: $enemyHp | ${hero.name} HP: ${hero.hp}")

    while(hero.isAlive() && enemyHp > 0){
        println("\n--- MENU ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if(choice == 1){
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if(enemyHp < 0) enemyHp = 0
            println("Enemy HP tersisa: $enemyHp")

            if (enemyHp > 0){
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik! Damage: $enemyDamage")
                hero.takeDamage(enemyDamage)
                println("${hero.name} HP tersisa: ${hero.hp}")
            }
        } else if (choice == 2){
            println("${hero.name} memilih kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid")
        }

    }

    println("\n--- HASIL PERTARUNGAN --- ")
    if(enemyHp <= 0){
        println("${hero.name} MENANG! Enemy telah dikalahkan!")
    } else if (!hero.isAlive()){
        println("${hero.name} KALAH! Hero telah gugur...")
    } else {
        println("${hero.name} kabur dari pertarungan.")
    }

}
