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
    val person = Person("Péter")
    val student = Student("Tibi", "GDE")

    person.introduce()
    student.introduce()
}