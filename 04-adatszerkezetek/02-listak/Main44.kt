fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    println("Van Tibi kulcs: ${ages.containsKey("Tibi")}")
    println("Van Józsi kulcs: ${ages.containsKey("Józsi")}")

    println("Van 44 érték: ${ages.containsValue(44)}")
    println("Van 100 érték: ${ages.containsValue(100)}")
}