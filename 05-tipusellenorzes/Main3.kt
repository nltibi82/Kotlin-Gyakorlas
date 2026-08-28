fun main() {
    val value: Any = 42

    if (value !is String) {
        println("A változó nem String")
    }
}