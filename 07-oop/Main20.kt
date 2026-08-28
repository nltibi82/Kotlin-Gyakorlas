open class Person(val name: String) {

    fun introduce() {
        println("Szia, $name vagyok.")
    }
}

class Student(name: String, val university: String) : Person(name)

fun main() {
    val student = Student("Tibi", "GDE")

    student.introduce()
    println("Egyetem: ${student.university}")
}