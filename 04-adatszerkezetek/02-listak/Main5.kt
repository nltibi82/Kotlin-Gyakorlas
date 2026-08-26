fun main() {
    val numbers = mutableListOf(10, 20, 30, 40, 50)

    println("Eredeti lista: $numbers")

    numbers.removeAt(2)

    println("Módosított lista: $numbers")
}