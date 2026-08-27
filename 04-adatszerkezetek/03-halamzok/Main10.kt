fun main() {
    val numbers = mutableSetOf(10, 20, 30, 40)

    val removed = numbers.remove(30)

    println("Sikeres törlés: $removed")
    println("Maradék Set: $numbers")
}