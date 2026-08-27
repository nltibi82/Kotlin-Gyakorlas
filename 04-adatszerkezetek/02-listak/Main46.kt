fun main() {
    val ages = mutableMapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    ages["Józsi"] = 50

    println("Eredeti adatok: $ages")
    println("Józsi életkora: ${ages["Józsi"]}")
}