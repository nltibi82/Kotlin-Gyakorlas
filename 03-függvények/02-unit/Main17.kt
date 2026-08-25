fun main() {
    print("Add meg az életkorod: ")
    val age = readln().toInt()

    if (isValidAge(age)) {
        println("Érvényes életkor.")
    } else {
        println("Érvénytelen életkor.")
    }
}

fun isValidAge(age: Int): Boolean {
    return age >= 0 && age <= 120
}