fun main() {
    val numbers = listOf(10, 20, 30, 40, 50)

    val doubled = numbers.map { it * 2 }

    println("Eredeti lista: $numbers")
    println("Duplázott lista: $doubled")
}