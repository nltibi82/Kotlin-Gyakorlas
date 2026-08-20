fun main(){
    var number = 1
    var min = 99999
    var max = 0
    while (number != 0) {
        print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        if (number != 0 && number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    println("Legkisebb: $min")
    println("Legnagyobb: $max")
}