fun main() {
    println(createMessage())
    println(createMessage("Tibi"))
    println(createMessage("Tibi", "Helló"))
    println(createMessage("Tibi", "Helló", "!"))
}

fun createMessage(
    name: String = "Vendég",
    greeting: String = "Szia",
    punctuation: String = "!"
): String {
    return "$greeting, $name$punctuation"
}