class Person(var name: String, var age: Int)

fun main() {
    val person = Person("Tibi", 44)

    println("Eredeti: ${person.name}, ${person.age}")

    person.name = "Anna"
    person.age = 28

    println("Módosított: ${person.name}, ${person.age}")
}