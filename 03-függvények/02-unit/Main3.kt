fun main() {
    val number1 = readNumber()
    val number2 = readNumber()

    val result = add(number1, number2)

    println("Az összeg: $result")
}
fun add(a: Double, b: Double): Double {
    return a + b
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