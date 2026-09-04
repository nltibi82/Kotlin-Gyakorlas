fun main(){
    val peoples = mutableListOf<Person>()
    val student = Student("Tibi",44, "GDE")
    val person: Person = Student("Anna", 40, "BME")
    val teacher = Teacher("Anna", 35, "Kotlin")
    val teacher2: Person = Teacher("Éva", 55, "Matek")
    val teachers = mutableListOf<CanTeach>()
    peoples.add(student)
    peoples.add(person)
    peoples.add(teacher)
    peoples.add(teacher2)
    teachers.add(teacher)
    teachers.add(Teacher("Béla",50,"Java"))
    teachers.add(GuestSpeaker("Kotlin OOP","Kotlin"))
    for (people in peoples){
        people.introduce()
        people.work()
        people.study()
        people.teach()
        println(people.name)
    }
    for (teacher in teachers) {
        teacher.teach()
        println(teacher.description)
    }
}