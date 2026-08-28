fun main() {
    try {
        val number = "123".toInt()
        println("Szám: $number")
    } catch (e: NumberFormatException) {
        println("Hibás számformátum")
    } finally {
        println("A művelet befejeződött")
    }
}