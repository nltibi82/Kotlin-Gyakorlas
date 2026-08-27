fun main() {
    val names = listOf("Tibi", "Péter", "Anna")

    val namesByLength = names.associateBy { it.length }

    println("Nevek: $names")
    println("Hossz → név: $namesByLength")
}