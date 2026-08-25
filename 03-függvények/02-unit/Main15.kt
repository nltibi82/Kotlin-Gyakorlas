fun main() {
    print("Adj meg egy számot: ")
    val number = readln().toDouble()

    if (isZero(number)) {
        println("A szám nulla.")
    } else {
        println("A szám nem nulla.")
    }
}

fun isZero(number: Double): Boolean {
    return number == 0.0
}