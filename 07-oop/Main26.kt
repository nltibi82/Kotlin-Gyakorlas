abstract class Person(val name: String) {

    abstract fun introduce()
}

class Student(name: String) : Person(name) {

    override fun introduce() {
        println("Szia, $name vagyok, hallgató.")
    }
}

fun main() {
    val student = Student("Tibi")

    student.introduce()
}