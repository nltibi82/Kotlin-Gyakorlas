fun main(){
    val peoples = mutableListOf<Person>()
    val student = Student("Tibi",44, "GDE")
    val person: Person = Student("Anna", 40, "BME")
    val teacher = Teacher("Anna", 35, "Kotlin")
    val teacher2: Person = Teacher("Éva", 55, "Matek")
    val canteach: CanTeach = Teacher("Kati", 40, "Közgáz")
    val person2: Person = Teacher("Kati", 40, "Közgáz")
    peoples.add(student)
    peoples.add(person)
    peoples.add(teacher)
    peoples.add(teacher2)
    for (people in peoples){
        people.introduce()
        people.work()
        people.study()
        people.teach()
        println(people.name)
    }
    canteach.teach()
    person2.study()
}