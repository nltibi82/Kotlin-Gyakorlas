fun main(){
    print("Adj meg egy számot 1 és 3 között: ")
    val number = readln().toInt()
    when (number){
        1 -> println("Egy")
        2 -> println("Kettő")
        3 -> println("Három")
        else -> println("Ismeretlen szám.")
    }
}