interface Printable {
    fun printInfo()
}

class Person(val name: String, val age: Int) : Printable {

    override fun printInfo() {
        println("Név: $name, életkor: $age")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.printInfo()
}