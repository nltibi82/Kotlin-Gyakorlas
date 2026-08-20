fun main(){
    val number1 = readNumber()
    val number2 = readNumber()
    println("Az összeg: ${number1 + number2}")
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