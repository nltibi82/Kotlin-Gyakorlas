fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    val adults = ages.filter { it.value >= 30 }

    println("Eredeti Map: $ages")
    println("30 év felettiek: $adults")
}