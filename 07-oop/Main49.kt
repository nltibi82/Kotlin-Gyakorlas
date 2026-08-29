class Student (var name: String, var age: Int){
    fun introduce() {
        println("Szia, $name vagyok, $age éves.")
    }    
}
fun main(){
    val student = Student("Tibi", 44)
    student.introduce()
}