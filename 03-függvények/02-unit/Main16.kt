fun main() {
    print("Adj meg egy számot: ")
    val number = readln().toDouble()

    if (isInRange(number, 1.0, 10.0)) {
        println("A szám a tartományban van.")
    } else {
        println("A szám nincs a tartományban.")
    }
}

fun isInRange(number: Double, min: Double, max: Double): Boolean {
    return number >= min && number <= max
}