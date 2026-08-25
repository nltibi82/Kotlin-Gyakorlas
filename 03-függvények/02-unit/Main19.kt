fun main() {
    print("Add meg a pontszámot: ")
    val score = readln().toInt()

    println("Értékelés: ${getGrade(score)}")
}
fun getGrade(score: Int): String {
    if (score >= 90) {
        return "Jeles"
    } else if (score >= 75) {
        return "Jó"
    } else if (score >= 60) {
        return "Közepes"
    } else if (score >= 50) {
        return "Elégséges"
    } else {
        return "Elégtelen"
    }
}