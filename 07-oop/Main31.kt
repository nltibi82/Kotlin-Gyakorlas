interface Printable {

    fun printInfo() {
        println("Általános információ")
    }
}

class Person(val name: String) : Printable {

    override fun printInfo() {
        println("Személy neve: $name")
    }
}

fun main() {
    val person = Person("Tibi")

    person.printInfo()
}