fun main() {
    var number : Int
    do{
        print("Adj meg egy számot 1 és 10 között: ")
        number = readln().toInt()
        if (number !in 1..10) {
            println("Hibás érték!")
    }
    }
    while(number !in 1..10)
    println("Elfogadva: $number")
}