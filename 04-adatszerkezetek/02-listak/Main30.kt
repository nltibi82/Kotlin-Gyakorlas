fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val remaining = numbers.drop(3)

    println("Eredeti lista: $numbers")
    println("Első három elhagyása után: $remaining")
}