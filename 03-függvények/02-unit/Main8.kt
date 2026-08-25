fun main() {
    val text: String? = null

    val length = getLength(text) ?: 0

    println("Hossz: $length")
}

fun getLength(text: String?): Int? {
    return text?.length
}