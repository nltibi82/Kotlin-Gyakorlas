class Person {
    var name = ""
    var age = 0
}

fun main() {
    val person = Person()

    person.name = "Tibi"
    person.age = 44

    println("Név: ${person.name}")
    println("Életkor: ${person.age}")
}