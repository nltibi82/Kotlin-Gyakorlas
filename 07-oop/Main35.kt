data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Tibi", 44)

    val person2 = person1.copy(age = 45)

    println("Eredeti: $person1")
    println("Másolat: $person2")
}