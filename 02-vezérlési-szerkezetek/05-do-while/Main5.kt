fun main() {
    var choice : Int
    do{
        println("1 - Négyzet számítása")
        println("2 - Duplázás")
        println("3 - Kilépés")
        print("Választás: ")

        choice = readln().toInt()

        when (choice) {
            1 -> {
                print("Adj meg egy számot: ")
                val number = readln().toInt()
                println("A négyzete: ${number*number}")
            }
            2 -> {
                print("Adj meg egy számot: ")
                val number = readln().toInt()
                println("A duplája: ${number*2}")
            }
            3 -> println("Viszlát!")
        }
    }
    while (choice != 3)
}