class Student(name: String, age: Int, var university: String ) : Person(name, age){
    fun study(){
        println("${name} tanul.")
    }
}