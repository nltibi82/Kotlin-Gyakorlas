fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    println("Van 20-nál nagyobb: ${numbers.any { it > 20 }}")
    println("Van 100-nál nagyobb: ${numbers.any { it > 100 }}")
}