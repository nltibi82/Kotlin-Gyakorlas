fun main(){
    print("Hány éves vagy?")
    val age = readln().toInt()
    if (age>=18){
        println("Felnőtt")
    } else {
        println("Kiskorú")
    }
}