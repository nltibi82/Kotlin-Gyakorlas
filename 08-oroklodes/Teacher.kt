class Teacher(name: String, age: Int, override var subject : String): Person(name,age), CanTeach{
    override fun introduce(){
        super.introduce()
        println("Tantárgy: ${subject}")
    }
    override fun work(){
        println("${name} tanít.")
    }
    override fun teach() {
        println("${name} a ${subject} tárgyat tanítja.")
    }
    override  fun study(){
        println("${name} felkészül az órára.")
    }
}