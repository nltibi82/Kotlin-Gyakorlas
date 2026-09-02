fun main(){
    val student = Student("Tibi",44, "GDE")
    val person: Person = Student("Anna", 40, "BME")
    val teacher = Teacher("Anna", 35, "Kotlin")
    val teacher2: Person = Teacher("Éva", 55, "BGE")
    student.introduce()
    student.study()
    person.introduce()
    teacher.introduce()
    teacher2.introduce()
}