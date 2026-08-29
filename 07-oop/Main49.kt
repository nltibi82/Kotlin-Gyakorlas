class Student (
    var name: String, 
    age: Int,
    private var grades : MutableList<Int> = mutableListOf())
    {
    var age: Int = age
        private set
        
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
    fun changeAge(number : Int) {
        if (number>=0) {
            age=number
        }
    }   
}
fun main(){
    val student = Student("Tibi", 44)
    student.addGrade(5)
    student.addGrade(3)
    student.addGrade(4)
    student.introduce()
    println(student.age)
    student.changeAge(46)
    student.introduce()
}