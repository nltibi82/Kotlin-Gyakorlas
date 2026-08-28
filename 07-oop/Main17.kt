class Person(val name: String, val age: Int) {

    init {
        if (age < 0) {
            println("Hiba: az életkor nem lehet negatív!")
        }
    }
}

fun main() {
    val person = Person("Tibi", -10)

    println("Név: ${person.name}")
    println("Életkor: ${person.age}")
}