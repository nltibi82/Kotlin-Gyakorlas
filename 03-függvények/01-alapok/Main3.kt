fun main(){
    val number = readNumber()
    println("A duplája: ${doubleNumber(number)}")
}

fun doubleNumber(number: Double): Double {
    return number * 2
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