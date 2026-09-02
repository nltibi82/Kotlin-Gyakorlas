class Student(name: String, age: Int, var university: String ) : Person(name, age){
    override fun study(){
        println("${name} tanul.")
    }
    override fun introduce(){
        super.introduce()
        println("Egyetem: ${university}")
    }
    override fun work(){
        println("${name} tanul.")
    }
}