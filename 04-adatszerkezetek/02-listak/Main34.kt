fun main() {
    val names = listOf("Tibi", "Péter", "Anna")
    val ages = listOf(44, 35, 28)

    val people = names.zip(ages)

    println(people)
}