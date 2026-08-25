fun main() {
    print("Adj meg egy egész számot: ")
    val number = readln().toInt()

    if (isEven(number)) {
        println("A szám páros.")
    } else {
        println("A szám páratlan.")
    }
}
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}