fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val result = numbers
        .filter { it > 20 }
        .map { it * 2 }

    println("Eredmény: $result")
}