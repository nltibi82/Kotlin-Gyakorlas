fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val filtered = numbers.filter { it > 20 }

    println("Eredeti lista: $numbers")
    println("Szűrt lista: $filtered")
}