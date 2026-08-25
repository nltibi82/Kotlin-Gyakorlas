fun main() {
    print("Adj meg egy pontszámot: ")
    val score = readln().toInt()

    println("Értékelés: ${getGrade(score)}")
}

fun getGrade(score: Int): String {
    return when {
        score >= 90 -> "Jeles"
        score >= 75 -> "Jó"
        score >= 60 -> "Közepes"
        score >= 50 -> "Elégséges"
        else -> "Elégtelen"
    }
}