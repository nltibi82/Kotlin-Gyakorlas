open class Person(val name: String)

class Student(name: String, val university: String) : Person(name)

fun main() {
    val person: Person = Student("Tibi", "GDE")

    println("Person: ${person is Person}")
    println("Student: ${person is Student}")
}