fun main(){
    val num1 = readNumber()
    val num2 = readNumber()
    val result = divide(num1, num2)

    if (result == null) {
        println("Hiba: nullával nem lehet osztani!")
    } else {
        println("Eredmény: $result")
    }

}
fun divide(a: Double, b: Double): Double? {
    if (b == 0.0) {
        return null
    }

    return a / b
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