class Person(private var name: String, private var age: Int) {

    fun getName(): String {
        return name
    }

    fun changeName(newName: String) {
        name = newName
    }
}

fun main() {
    val person = Person("Tibi", 44)

    println("Eredeti név: ${person.getName()}")

    person.changeName("Anna")

    println("Új név: ${person.getName()}")
}