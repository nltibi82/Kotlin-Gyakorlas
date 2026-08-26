fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    println("Nincs negatív szám: ${numbers.none { it < 0 }}")
    println("Nincs 20-nál nagyobb szám: ${numbers.none { it > 20 }}")
}