fun main() {
    val first = setOf(10, 20, 30)
    val second = setOf(30, 20, 10)
    val third = setOf(10, 20, 40)

    println("Első és második azonos: ${first == second}")
    println("Első és harmadik azonos: ${first == third}")
}