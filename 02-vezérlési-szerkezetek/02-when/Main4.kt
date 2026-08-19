fun main() {
    print("Adj meg egy számot 1 és 3 között: ")
    val number = readln().toInt()
    val result = when (number) {
        1 -> "Egy"
        2 -> "Kettő"
        3 -> "Három"
        else -> "Ismeretlen"
    }
    println(result)
}