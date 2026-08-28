open class Person(val name: String) {

    open fun introduce() {
        println("Szia, $name vagyok.")
    }
}

class Student(name: String, val university: String) : Person(name) {

    override fun introduce() {
        super.introduce()
        println("A GDE hallgatója vagyok.")
    }
}

fun main() {
    val student = Student("Tibi", "GDE")

    student.introduce()
}