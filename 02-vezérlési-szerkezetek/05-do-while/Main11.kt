fun main(){
    var choice : Int
    var num1 : Double?
    var num2 : Double?
    do{
        println("1 - Összeadás")
        println("2 - Kivonás")
        println("3 - Szorzás")
        println("4 - Osztás")
        println("5 - Kilépés")
        print("Választás:")
         
        choice = readln().toInt()
        
        when(choice){
            1 -> {
                do{
                    print("Első szám: ")
                    num1 = readln().toDoubleOrNull()
                    if (num1 == null) {
                        println("Hibás szám!")
                    }
                } while (num1 == null)
                do{
                    print("Második szám: ")
                    num2 = readln().toDoubleOrNull()
                    if (num2 == null) {
                        println("Hibás szám!")
                    }
                } while (num2 == null)
                println("Eredmény: ${num1+num2}")
            }
            2 -> {
                do{
                    print("Első szám: ")
                    num1 = readln().toDoubleOrNull()
                    if (num1 == null) {
                        println("Hibás szám!")
                    }
                } while (num1 == null)
                do{
                    print("Második szám: ")
                    num2 = readln().toDoubleOrNull()
                    if (num2 == null) {
                        println("Hibás szám!")
                    }
                } while (num2 == null)
                println("Eredmény: ${num1-num2}")
            }
            3 -> {
                do{
                    print("Első szám: ")
                    num1 = readln().toDoubleOrNull()
                    if (num1 == null) {
                        println("Hibás szám!")
                    }
                } while (num1 == null)
                do{
                    print("Második szám: ")
                    num2 = readln().toDoubleOrNull()
                    if (num2 == null) {
                        println("Hibás szám!")
                    }
                } while (num2 == null)
                println("Eredmény: ${num1*num2}")
            }
            4 -> {
                do{
                    print("Első szám: ")
                    num1 = readln().toDoubleOrNull()
                    if (num1 == null) {
                        println("Hibás szám!")
                    }
                } while (num1 == null)
                do{
                    print("Második szám: ")
                    num2 = readln().toDoubleOrNull()
                    if (num2 == null) {
                        println("Hibás szám!")
                    }
                } while (num2 == null)
                println("Eredmény: ${num1/num2}")
            }
        }
    } while (choice != 5)
}