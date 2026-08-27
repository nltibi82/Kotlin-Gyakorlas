fun main() {
    val numbers = setOf(10, 20, 30, 40, 50)
    val otherNumbers = setOf(10, 20, 100)

    println("Minden elem megtalálható: ${numbers.containsAll(otherNumbers)}")
}