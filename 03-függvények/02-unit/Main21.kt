fun main() {
    print("Válassz egy számot (1-3): ")
    val choice = readln().toInt()

    println(getMessage(choice))
}

fun getMessage(choice: Int): String {
    return when (choice) {
        1 -> "Köszönés"
        2 -> "Időjárás"
        3 -> "Kilépés"
        else -> "Ismeretlen választás"
    }
}