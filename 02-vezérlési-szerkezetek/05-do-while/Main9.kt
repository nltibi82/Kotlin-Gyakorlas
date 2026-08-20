fun main(){
    print("Kérek egy számot: ")
    val number = readln().toDoubleOrNull()
    if (number == null) {
        println("Hibás szám!")
    } else {
        println("Érvényes szám: $number")
    }
}