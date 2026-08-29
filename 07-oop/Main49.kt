class Student (
    var name: String, 
    var age: Int, 
    var grades : MutableList<Int> = mutableListOf())
    {
    fun introduce() {
        println("Szia, $name vagyok, $age éves.")
        println("Jegyek: ${grades}")
    }    
}
fun main(){
    val student = Student("Tibi", 44)
    student.introduce()
}