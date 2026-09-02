fun main(){
    val peoples = mutableListOf<Person>()
    val student = Student("Tibi",44, "GDE")
    val person: Person = Student("Anna", 40, "BME")
    val teacher = Teacher("Anna", 35, "Kotlin")
    val teacher2: Person = Teacher("Éva", 55, "Matek")
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
}