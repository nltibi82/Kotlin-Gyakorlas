fun main() {
    println(createMessage())
    println(createMessage("Tibi"))
    println(createMessage("Tibi", "Helló"))
    println(createMessage("Tibi", "Helló", "?"))
    println(createMessage(punctuation = "?"))
    println(createMessage(name = "Tibi", punctuation = "!!!"))
}

fun createMessage(
    name: String = "Vendég",
    greeting: String = "Szia",
    punctuation: String = "!"
): String {
    return "$greeting, $name$punctuation"
}