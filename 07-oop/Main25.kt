open class Person(val name: String)

class Student(
    name: String,
    val university: String
) : Person(name)

fun main() {
    val person: Person = Student("Tibi", "GDE")

    if (person is Student) {
        println("Név: ${person.name}")
        println("Egyetem: ${person.university}")
    }
}