class Person(val name: String, val age: Int) {

    init {
        require(age >= 0) {
            "Az életkor nem lehet negatív!"
        }
    }
}

fun main() {
    try {
        val person = Person("Tibi", -10)

        println("Név: ${person.name}")
        println("Életkor: ${person.age}")
    } catch (e: IllegalArgumentException) {
        println("Hiba: ${e.message}")
    }
}