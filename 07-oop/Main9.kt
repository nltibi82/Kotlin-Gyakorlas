class Person(val name: String, val age: Int) {

    fun printData() {
        println("Név: ${this.name}")
        println("Életkor: ${this.age}")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.printData()
}