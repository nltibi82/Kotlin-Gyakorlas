fun main() {
    val ages = mutableMapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    val removedAge = ages.remove("Péter")

    println("Törölt életkor: $removedAge")
    println("Maradék adatok: $ages")
}