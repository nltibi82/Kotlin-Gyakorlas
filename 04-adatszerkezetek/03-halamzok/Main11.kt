fun main() {
    val numbers = mutableSetOf(10, 20, 30, 40)

    println("Eredeti Set: $numbers")

    numbers.clear()

    println("Kiürített Set: $numbers")
    println("Elemek száma: ${numbers.size}")
}