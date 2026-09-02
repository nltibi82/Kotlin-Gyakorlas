abstract class Person(var name: String, var age: Int){
    open fun introduce(){
        println("Személy: ${name}")
        println("Életkor: ${age}")
    }
    open fun work(){
        println("A személy dolgozik.")
    }
    abstract fun study()
    
    open fun teach(){
        println("A személy tanít.")
    }
}