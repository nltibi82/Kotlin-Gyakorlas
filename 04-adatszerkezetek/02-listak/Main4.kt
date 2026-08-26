fun main() {
    val numbers = mutableListOf(10, 20, 30, 40, 50)

    println("Eredeti lista: $numbers")

    numbers[1] = 200
    numbers.remove(30)

    println("Módosított lista: $numbers")
}