fun main() {
    print("Adj meg egy számot: ")
    val number = readln().toDouble()

    if (isPositive(number)) {
        println("A szám pozitív.")
    } else {
        println("A szám nem pozitív.")
    }
}

fun isPositive(number: Double): Boolean {
    return number > 0
}