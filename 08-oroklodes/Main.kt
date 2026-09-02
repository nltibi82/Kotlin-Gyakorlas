fun main(){
    val peoples = mutableListOf<Person>()
    val student = Student("Tibi",44, "GDE")
    val person: Person = Student("Anna", 40, "BME")
    val teacher = Teacher("Anna", 35, "Kotlin")
    val teacher2: Person = Teacher("Éva", 55, "BGE")
    peoples.add(student)
    peoples.add(person)
    peoples.add(teacher)
    peoples.add(teacher2)
    for (people in peoples){
        people.introduce()
        people.work()
        println(people.name)
        if (people is Student) {
            people.study()
        }
    }
    student.study()
}