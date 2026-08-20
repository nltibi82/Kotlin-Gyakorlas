fun main(){
    print("Add meg a neved: ")
    val name = readln()
    print("Add meg az életkorod: ")
    val age = readln().toInt()
    printPerson(name,age)
}
fun printPerson(name: String, age: Int) {
    println("Név: $name, életkor: $age")
}