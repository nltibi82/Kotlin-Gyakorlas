class Person(private var name: String, private var age: Int) {

    fun printData() {
        println("Név: $name")
        println("Életkor: $age")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.printData()
}