package oop_00000105359_NathanaelValentinoSutanto.week10
//Checkpoint 20 "week10: (task) test full generic crypto architecture"
fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Koin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1200.0))
    txRepo.add(Transaction("TX003", 75.5))
}