package oop_00000105359_NathanaelValentinoSutanto.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PEMINJAMAN BUKU ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    // Validasi
    if(loanDuration < 0){
        println("WARNING: Durasi tidak boleh minus! Otomatis diubah menjadi 1 hari.")
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}