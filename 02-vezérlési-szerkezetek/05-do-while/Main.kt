fun main(){
    var number: Int
    do {
        print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        println(number)
    } while (number != 0)
}