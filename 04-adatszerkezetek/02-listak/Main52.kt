fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    val selectedNames = ages.filterKeys { it.length > 4 }
    val selectedAges = ages.filterValues { it >= 30 }

    println("Név alapján: $selectedNames")
    println("Életkor alapján: $selectedAges")
}