class Person(name: String, age: Int) {
    private val personName = name
    private val personAge = age

    fun printData() {
        println("Név: $personName")
        println("Életkor: $personAge")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.printData()
}