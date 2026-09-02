fun main(){
    val student = Student("Tibi",44, "GDE")
    val person: Person = Student("Anna", 40, "BME")
    val teacher = Teacher("Anna", 35, "Kotlin")
    student.introduce()
    student.study()
    person.introduce()
    println("Név: ${teacher.name}")
    println("Életkor: ${teacher.age}")
    println("Tantárgy: ${teacher.subject}")
}