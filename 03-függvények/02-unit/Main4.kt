fun main() {
    val num1 = readNumber()
    val num2 = readNumber()
    
    println("Összeg: ${add(num1,num2)}")
    println("Különbség: ${subtract(num1,num2)}")
    println("Szorzat: ${multiply(num1,num2)}")
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a * b
}
fun readNumber(): Double {
    var number: Double?
    do{
        print("Adj meg egy számot: ")
        number = readln().toDoubleOrNull()
        if (number == null) {
            println("Hibás szám!")
        } 
   } while (number == null)
   return number
}