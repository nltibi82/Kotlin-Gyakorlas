fun main(){
    var choice : Int
    var num1=0
    var num2=0
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
                print("Első szám: ")
                num1 = readln().toInt()
                print("Második szám: ")
                num2 = readln().toInt()
                println("Eredmény: ${num1+num2}")
            }
            2 -> {
                print("Első szám: ")
                num1 = readln().toInt()
                print("Második szám: ")
                num2 = readln().toInt()
                println("Eredmény: ${num1-num2}")
            }
            3 -> {
                print("Első szám: ")
                num1 = readln().toInt()
                print("Második szám: ")
                num2 = readln().toInt()
                println("Eredmény: ${num1*num2}")
            }
            4 -> {
                print("Első szám: ")
                num1 = readln().toInt()
                print("Második szám: ")
                num2 = readln().toInt()
                println("Eredmény: ${num1/num2}")
            }
        }
    } 
    while (choice !=5)
}