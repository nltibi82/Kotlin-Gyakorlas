fun main() {
    val names = listOf("Tibi", "Péter", "Anna")

    val nameLengths = names.associateWith { it.length }

    println("Nevek: $names")
    println("Név → hossz: $nameLengths")
}