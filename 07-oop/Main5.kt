class Person(val name: String, val age: Int) {

    fun introduce() {
        println("Szia, $name vagyok, $age éves.")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.introduce()
}