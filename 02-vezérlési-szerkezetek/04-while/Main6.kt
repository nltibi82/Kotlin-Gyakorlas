fun main(){
    var number = 1
    var count = 0
    while (number != 0){
        print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        if (number != 0) {
            count++
        }
    }
    println("$count számot adtál meg.")
}