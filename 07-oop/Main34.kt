data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Tibi", 44)
    val person2 = Person("Tibi", 44)

    println(person1)
    println(person1 == person2)
}