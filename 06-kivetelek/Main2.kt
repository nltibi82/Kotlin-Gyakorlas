fun main() {
    try {
        val number = "abc".toInt()
        println("Szám: $number")
    } catch (e: NumberFormatException) {
        println("Hiba történt: ${e.message}")
    }
}