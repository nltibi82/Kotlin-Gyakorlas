fun main(){
    print("Add meg a neved: ")
    val name = readln()
    greet(name)
}
fun greet(name: String) {
    println("Szia, $name!")
}