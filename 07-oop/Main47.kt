interface Printable {
    fun printInfo()
}

enum class Role {
    STUDENT,
    TEACHER
}

data class Person(
    val name: String,
    val age: Int,
    val role: Role
) : Printable {

    override fun printInfo() {
        println("$name, $age éves, szerep: $role")
    }

    companion object {
        fun createStudent(name: String, age: Int): Person {
            return Person(name, age, Role.STUDENT)
        }
    }
}

fun main() {
    val person = Person.createStudent("Tibi", 44)

    person.printInfo()
}