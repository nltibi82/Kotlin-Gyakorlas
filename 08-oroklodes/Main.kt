fun main(){
    val student = Student("Tibi",44, "GDE")
    println("Név: ${student.name}")
    println("Életkor: ${student.age}")
    println("Egyetem: ${student.university}")
    student.study()
}