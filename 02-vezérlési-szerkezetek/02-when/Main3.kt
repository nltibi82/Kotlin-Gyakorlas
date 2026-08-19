fun main() {
    print("Adj meg egy számot 1 és 6 között: ")
    val number = readln().toInt()
    when (number) {
        1, 2, 3 -> println("Kis szám.")
        4, 5, 6 -> println("Nagy szám.")
        else -> println("Érvénytelen szám.")
    }
}