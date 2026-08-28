fun main() {
    val value: Any = 42

    if (value is Int) {
        println("A változó Int")
        println("Értéke: $value")
    }
}