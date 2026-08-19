fun main() {
    print("Hány éves vagy? ")
    val age = readln().toInt()
    if (age<18) {
        println ("Kiskorú")
    } else if (age<65) {
        println("Felnőtt")
    }
    else {
        println("Nyugdíjas")
    }
}