fun main(){
    print("Adj meg egy nevet: ")
    val name = readln()
    print("Melyik karaktert keressem? ")
    val searchChar = readln()[0]
    var count = 0
    for (char in name) {
        if (char == searchChar) {
            count++
        }
    }
    println("Az '$searchChar' karakter $count alkalommal szerepel.")
}
