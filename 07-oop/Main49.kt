class Student (
    name: String, 
    age: Int,
    private var grades : MutableList<Int> = mutableListOf())
    {
    var age: Int = age 
    private set
    
    var name: String =name 
    private set
        
    fun addGrade(number: Int){
        if( number>0 && number<=5){
            grades.add(number)
        } else {
            println("Érvénytelen jegy!")
        }
    }
    fun introduce() {
        println("Szia, $name vagyok, $age éves.")
        println("Jegyek: ${grades}")
        println("Átlag: ${getAverage()}")
        if (getBestGrade() == null) {
            println("Legjobb jegy: ?")
        } else {
            println("Legjobb jegy: ${getBestGrade()}")
        }
        val gwg=getWorstGrade()
        if (gwg == null) {
             println("Legrosszabb jegy: ?")
        } else {
            println("Legrosszabb jegy: $gwg")
        }
    } 
    fun getAverage():Double{
        if (grades.isEmpty()){
            return 0.0
        } else {
            return grades.average()
        }
    }
    fun changeAge(number : Int) {
        if (number>=0) {
            age=number
        }
    }   
    fun getBestGrade(): Int?{
        return  grades.maxOrNull()
    }
    fun getWorstGrade(): Int?{
        return  grades.minOrNull()
    }
    fun changeName(name: String){
        if(name.isEmpty()) {
            println("A név nem lehet üres!")
        } else {
            this.name=name
        }
    }
    fun getGrades():List<Int>{
        return grades.toList()
    }
}
fun main(){
    val student = Student("Tibi", 44)
    val student2 = Student("Anna", 40)
    student.addGrade(5)
    student.addGrade(3)
    student.addGrade(4)
    student.addGrade(6)
    student.introduce()
    student2.introduce()  
    student.changeName("Péter")
    student.introduce()
    student.changeName("")
    student.introduce()
}