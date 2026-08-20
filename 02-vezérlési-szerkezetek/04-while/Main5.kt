fun main(){
    var number = 1
    var sum = 0
    while (number != 0){
         print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        sum += number
    }
    println("Az összeg: $sum")
}