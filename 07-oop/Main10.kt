class Person(var name: String, var age: Int) {

    fun changeName(name: String) {
        this.name = name
    }
}

fun main() {
    val person = Person("Tibi", 44)

    println("Eredeti név: ${person.name}")

    person.changeName("Anna")

    println("Új név: ${person.name}")
}