fun main() {
    print("Első szám: ")
    val num1 = readln().toDouble()

    print("Második szám: ")
    val num2 = readln().toDouble()

    print("Művelet (+, -, *, /): ")
    val operation = readln()

    println("Eredmény: ${calculate(num1, num2, operation)}")
}

fun calculate(a: Double, b: Double, operation: String): String {
    return when (operation) {
        "+" -> (a + b).toString()
        "-" -> (a - b).toString()
        "*" -> (a * b).toString()
        "/" -> {
            if (b == 0.0) {
                "Hiba: nullával nem lehet osztani!"
            } else {
                (a / b).toString()
            }
        }
        else -> "Ismeretlen művelet"
    }
}