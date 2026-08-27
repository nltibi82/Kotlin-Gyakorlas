fun main() {
    val names = listOf("Tibi", "Péter", "Anna")

    val namesByLength = names.groupBy { it.length }

    println("Nevek: $names")
    println("Hossz → nevek: $namesByLength")
}