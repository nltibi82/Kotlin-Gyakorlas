fun main(){
    val age = 17
    val aktiv = false
    if (age >= 18 && age < 65){
        println("Munkaképes korú")
    }
    if (age < 18 || age >= 65){
        println("Nem munkaképes korú")
    }
    if (!aktiv) {
        println("A rendszer nem aktív.")
    }
}