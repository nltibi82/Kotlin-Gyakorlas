fun main() {
    print("Add meg az életkorod: ")
    val age = readln().toInt()

    if (isAdult(age)) {
        println("Nagykorú.")
    } else {
        println("Kiskorú.")
    }
}

fun isAdult(age: Int): Boolean {
    return age >= 18
}