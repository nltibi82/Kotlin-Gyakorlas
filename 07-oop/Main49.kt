class Student (var name: String, var age: Int){
    
}
fun main(){
    val student = Student("Tibi", 44)
    println("Név: ${student.name}")
    println("Életkor: ${student.age}")
}