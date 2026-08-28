class Person(val name: String, val age: Int) {

    fun greet(otherName: String) {
        println("$name köszönti $otherName nevű személyt.")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.greet("Anna")
}