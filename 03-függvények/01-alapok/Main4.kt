fun main(){
    val number = readNumber()
    println("A négyzete: ${squareNumber(number)}")
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
fun squareNumber(number: Double): Double {
    return number * number
}