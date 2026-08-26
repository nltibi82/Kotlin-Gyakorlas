fun main() {
    println(createUser("Tibi", 44, true))

    println(createUser(
        age = 44,
        name = "Tibi",
        active = false
    ))
}

fun createUser(
    name: String,
    age: Int,
    active: Boolean
): String {
    return "$name, $age éves, aktív: $active"
}