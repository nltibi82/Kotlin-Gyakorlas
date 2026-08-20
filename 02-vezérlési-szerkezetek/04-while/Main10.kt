fun main() {
    var first = true
    var min = 0
    var max = 0
    var number = 1
    while (number != 0) {
        print("Adj meg egy számot (0 = vége): ")
        number = readln().toInt()
        if (number != 0) {
            if (first) {
                min = number
                max = number
                first = false
            } else {
                if (number < min) {
                min = number
                }
                if (number > max) {
                    max = number
                }
            }   
        }
    }
    println("Legkisebb: $min")
    println("Legnagyobb: $max")
}