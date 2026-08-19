fun main(){
    print("Hány éves vagy? ")
    val age = readln().toInt()
    when  {
        age<18 -> println("Gyerek.")
        age>=18 && age<65 -> println("Felnőtt.")
        else -> println("Nyugdíjas.")
    }
}