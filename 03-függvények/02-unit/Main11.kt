fun main() {
    val num1 = readNumber()
    val num2 = readNumber()

    println("A kisebb szám: ${min(num1, num2)}")
}
fun min(a: Double, b: Double): Double {
    if (a < b) {
        return a
    } else {
        return b
    }
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