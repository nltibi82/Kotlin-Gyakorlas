class Person(private var name: String, private var age: Int) {

    fun changeAge(newAge: Int) {
        if (newAge >= 0) {
            age = newAge
        } else {
            println("Az életkor nem lehet negatív!")
        }
    }

    fun printData() {
        println("Név: $name")
        println("Életkor: $age")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    person.printData()

    person.changeAge(45)
    person.printData()

    person.changeAge(-10)
    person.printData()
}