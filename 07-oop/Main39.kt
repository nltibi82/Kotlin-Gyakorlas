class Person(val name: String) {

    companion object {
        const val TYPE = "Person"

        fun createGuest(): Person {
            return Person("Vendég")
        }
    }
}

fun main() {
    println(Person.TYPE)

    val guest = Person.createGuest()

    println("Név: ${guest.name}")
}