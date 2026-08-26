fun main() {
    printNumbers("Számok", 1, 2, 3)
    printNumbers("Másik sor", 10, 20, 30, 40)
}

fun printNumbers(prefix: String, vararg numbers: Int) {
    print("$prefix: ")

    for (number in numbers) {
        print("$number ")
    }

    println()
}