fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    val nextYearAges = ages.mapValues { it.value + 1 }

    println("Eredeti életkorok: $ages")
    println("Jövő évi életkorok: $nextYearAges")
}