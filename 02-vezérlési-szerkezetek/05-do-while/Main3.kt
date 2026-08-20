fun main() {
    var choice : Int
    do{
        println("1 - Köszönés")
        println("2 - Kilépés")
        print("Választás: ")

        choice = readln().toInt()

        when (choice) {
            1 -> println("Szia!")
            2 -> println("Viszlát!")
        }
    }
    while (choice != 2)
}