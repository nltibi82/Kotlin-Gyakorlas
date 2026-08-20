fun main(){
    var number = 1
    var min = 99999
    while (number != 0) {
        print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        if (number != 0 && number < min) {
            min = number
        }
    }
    println("A legkisebb szám: $min")
}