fun main() {
    print("Adj meg egy számot: ")
    val number = readln().toDouble()

    if (isNegative(number)) {
        println("A szám negatív.")
    } else {
        println("A szám nem negatív.")
    }
}

fun isNegative(number: Double): Boolean {
    return number < 0
}