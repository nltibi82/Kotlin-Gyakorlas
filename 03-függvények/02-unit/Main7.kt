fun main() {
    val text: String? = null

    val length = getLength(text)

    println("Hossz: $length")
}

fun getLength(text: String?): Int? {
    return text?.length
}