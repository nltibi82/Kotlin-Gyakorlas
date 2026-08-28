class Person(val name: String, val age: Int) {

    fun introduce() {
        println("$name, $age éves")
    }
}

fun main() {
    val person1 = Person("Tibi", 44)
    val person2 = Person("Anna", 28)

    person1.introduce()
    person2.introduce()
}