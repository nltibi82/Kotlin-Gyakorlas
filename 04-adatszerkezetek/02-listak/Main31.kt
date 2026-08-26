fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val result = numbers.takeWhile { it < 35 }

    println("Eredeti lista: $numbers")
    println("35-nél kisebb elemek az elejéről: $result")
}