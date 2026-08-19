fun main(){
    print("Hogy hívnak?")
    val name = readln()
    print("Hány éves vagy?")
    val age = readln().toInt()
    println("Szia, $name")
    if (age>=18) {
        println("Felnőtt vagy.")
    } else {
        println("Még kiskorú vagy.")
    }
}