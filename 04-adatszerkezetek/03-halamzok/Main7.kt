fun main() {
    val first = setOf(10, 20, 30)
    val second = setOf(30, 40, 50)

    val result = first subtract second

    println("Első halmaz: $first")
    println("Második halmaz: $second")
    println("Különbség: $result")
}