interface Printable {
    fun printInfo()
}

interface Identifiable {
    fun getId(): Int
}

class Person(
    val name: String,
    val age: Int
) : Printable, Identifiable {

    override fun printInfo() {
        println("Név: $name, életkor: $age")
    }

    override fun getId(): Int {
        return 1001
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.printInfo()
    println("Azonosító: ${person.getId()}")
}