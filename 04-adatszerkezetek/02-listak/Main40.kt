fun main() {
    val person = Triple("Tibi", 44, true)

    val (name, age, active) = person

    println("Név: $name")
    println("Életkor: $age")
    println("Aktív: $active")
}