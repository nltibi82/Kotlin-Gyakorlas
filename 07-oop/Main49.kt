class Student (
    var name: String, 
    var age: Int, 
    var grades : MutableList<Int> = mutableListOf())
    {
    fun addGrade(number: Int){
        grades.add(number)
    }
    fun introduce() {
        println("Szia, $name vagyok, $age éves.")
        println("Jegyek: ${grades}")
        println("Átlag: ${getAverage()}")
    } 
    fun getAverage():Double{
        return grades.average()
    }   
}
fun main(){
    val student = Student("Tibi", 44)
    student.addGrade(5)
    student.addGrade(3)
    student.addGrade(4)
    student.introduce()
}