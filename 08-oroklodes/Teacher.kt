class Teacher(name: String, age: Int, var subject : String): Person(name,age){
    override fun introduce(){
        super.introduce()
        println("Tantárgy: ${subject}")
    }
}