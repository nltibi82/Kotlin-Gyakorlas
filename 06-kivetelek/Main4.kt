fun main() {
    try {
        val number = "abc".toInt()
        println("Szám: $number")
    } catch (e: NumberFormatException) {
        println("Hibás számformátum")
    } finally {
        println("A művelet befejeződött")
    }
}