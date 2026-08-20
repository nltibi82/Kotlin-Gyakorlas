fun main(){
    var number: Double?
    do{
        print("Adj meg egy számot: ")
        number = readln().toDoubleOrNull() 
        
        if (number == null) {
            println("Hibás szám!")
        }
    } while (number == null)
    println("Elfogadva: $number")
}