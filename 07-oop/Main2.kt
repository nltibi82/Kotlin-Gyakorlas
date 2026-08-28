class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Tibi", 44)

    println("Név: ${person.name}")
    println("Életkor: ${person.age}")
}