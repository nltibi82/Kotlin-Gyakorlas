fun main(){
    print("Adj meg egy nevet: ")
    val name = readln()
    print("Melyik karaktert keressem? ")
    val searchChar = readln()[0]
    var found = false
    for (char in name){
        if(char == searchChar){
            found=true
            break
        }
    }
    if (found) {
        println("Megtaláltam.")
    } else {
        println("Nincs benne.")
    }
}