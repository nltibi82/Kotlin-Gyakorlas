fun main() {
    val numbers = mutableSetOf(10, 20, 30, 40)

    println("Eredeti Set: $numbers")

    numbers.remove(30)

    println("Módosított Set: $numbers")
}