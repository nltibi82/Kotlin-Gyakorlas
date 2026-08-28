open class Person(val name: String) {

    open fun introduce() {
        println("Szia, $name vagyok.")
    }
}

class Student(name: String, val university: String) : Person(name) {

    override fun introduce() {
        println("Szia, $name vagyok, a GDE hallgatója.")
    }
}

fun main() {
    val people: List<Person> = listOf(
        Person("Péter"),
        Student("Tibi", "GDE")
    )

    for (person in people) {
        person.introduce()
    }
}