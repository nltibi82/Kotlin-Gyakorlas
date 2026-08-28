fun main() {
    val value: Any = "Kotlin"

    if (value is String) {
        println("A változó String")
        println("Hossza: ${value.length}")
    }
}