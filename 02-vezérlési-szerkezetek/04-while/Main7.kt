fun main(){
    var number = 1
    var max = 0
    while (number != 0) {
        print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        if (number > max) {
            max = number
        }
    }
    println("A legnagyobb szám: $max")
}