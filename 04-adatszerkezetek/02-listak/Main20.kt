fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val texts = numbers.map { "Szám: $it" }

    println("Eredeti lista: $numbers")
    println("Szöveges lista: $texts")
}