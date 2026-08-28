class Person(val name: String, val age: Int) {

    init {
        println("Első init blokk")
    }

    init {
        println("Második init blokk")
    }
}

fun main() {
    val person = Person("Tibi", 44)

    println("Objektum használata")
}