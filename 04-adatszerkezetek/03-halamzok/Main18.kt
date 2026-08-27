fun main() {
    val numbers = mutableSetOf(10, 20, 30)

    val added1 = numbers.add(40)
    val added2 = numbers.add(30)

    println("40 hozzáadása: $added1")
    println("30 hozzáadása: $added2")
    println("Set: $numbers")
}