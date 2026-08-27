fun main() {
    val ages = mutableMapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    println("Eredeti adatok: $ages")

    ages["Tibi"] = 45

    println("Módosított adatok: $ages")
}