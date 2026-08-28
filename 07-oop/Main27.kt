abstract class Person(val name: String) {

    abstract fun introduce()
}

class Student(name: String) : Person(name) {

    override fun introduce() {
        println("$name hallgató.")
    }
}

class Teacher(name: String) : Person(name) {

    override fun introduce() {
        println("$name oktató.")
    }
}

fun main() {
    val people: List<Person> = listOf(
        Student("Tibi"),
        Teacher("Anna")
    )

    for (person in people) {
        person.introduce()
    }
}