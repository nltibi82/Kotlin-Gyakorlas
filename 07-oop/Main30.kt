interface Printable {

    fun printInfo() {
        println("Általános információ")
    }
}

class Person(val name: String) : Printable

fun main() {
    val person = Person("Tibi")

    person.printInfo()
}