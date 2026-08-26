fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    println("Minden szám pozitív: ${numbers.all { it > 0 }}")
    println("Minden szám nagyobb 20-nál: ${numbers.all { it > 20 }}")
}