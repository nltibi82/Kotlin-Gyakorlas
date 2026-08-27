fun main() {
    val numbers = setOf(10, 20, 30, 40, 50)
    val smallNumbers = setOf(10, 20, 30)

    println("A kis halmaz részhalmaz: ${numbers.containsAll(smallNumbers)}")
}