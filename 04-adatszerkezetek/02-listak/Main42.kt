fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    for ((name, age) in ages) {
        println("$name: $age éves")
    }
}