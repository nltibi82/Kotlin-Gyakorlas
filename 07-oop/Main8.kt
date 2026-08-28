class Person(val name: String, val age: Int) {

    fun isAdult(): Boolean = age >= 18
}

fun main() {
    val person = Person("Tibi", 44)

    println("Felnőtt: ${person.isAdult()}")
}