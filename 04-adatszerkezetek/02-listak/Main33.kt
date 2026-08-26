fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    println("Első 30-nál nagyobb: ${numbers.find { it > 30 }}")
    println("Utolsó 30-nál nagyobb: ${numbers.findLast { it > 30 }}")
}