data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Tibi", 44)

    val (name, age) = person

    println("Név: $name")
    println("Életkor: $age")
}