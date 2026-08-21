fun main(){
    val num1 = readNumber()
    val num2 = readNumber()
    println("Eredmény: ${divide(num1, num2)}")
}
fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Hiba: nullával nem lehet osztani!")
        return 0.0
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