fun main() {
    print("Add meg a neved: ")
    val name = readln()

    println(greet(name))
    println(greet(name, "Helló"))
}

fun greet(name: String, greeting: String = "Szia"): String {
    return "$greeting, $name!"
}