fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    println("Tibi életkora: ${ages.getOrDefault("Tibi", 0)}")
    println("Józsi életkora: ${ages.getOrDefault("Józsi", 0)}")
}