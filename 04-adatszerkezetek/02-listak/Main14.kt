fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    println("Elemek száma: ${numbers.count()}")
    println("20-nál nagyobb elemek: ${numbers.count { it > 20 }}")
}