fun main(){
    print("Első szám: ")
    val num1 = readln().toDouble()

    print("Második szám: ")
    val num2 = readln().toDouble()

    print("Művelet (+, -, *, /): ")
    val operation = readln()
    
    val result = calculate(num1, num2, operation)

    if (result == null) {
        println("Hibás művelet vagy nullával osztás!")
    } else {
        println("Eredmény: $result")
    }
}
fun calculate(a: Double, b: Double, operation: String): Double? {
    return when (operation) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> {
            if (b == 0.0) {
                null
            } else {
                a / b
            }
        }
        else -> null
    }
}