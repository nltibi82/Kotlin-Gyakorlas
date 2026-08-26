fun main() {
    val numbers = listOf(10, 20, 10, 30, 20, 40, 30)

    val unique = numbers.distinct()

    println("Eredeti lista: $numbers")
    println("Egyedi elemek: $unique")
}