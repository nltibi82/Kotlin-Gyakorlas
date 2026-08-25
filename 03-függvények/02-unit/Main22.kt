fun main() {
    print("Adj meg egy napot (1-7): ")
    val day = readln().toInt()

    println(getDayType(day))
}

fun getDayType(day: Int): String {
    return when (day) {
        1, 2, 3, 4, 5 -> "Hétköznap"
        6, 7 -> "Hétvége"
        else -> "Érvénytelen nap"
    }
}