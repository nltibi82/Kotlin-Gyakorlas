class Person private constructor(
    val name: String,
    val age: Int
) {

    companion object {
        fun create(name: String, age: Int): Person {
            return Person(name, age)
        }
    }
}

fun main() {
    val person = Person.create("Tibi", 44)

    println("Név: ${person.name}")
    println("Életkor: ${person.age}")
}