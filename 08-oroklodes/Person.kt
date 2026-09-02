open class Person(var name: String, var age: Int){
    open fun introduce(){
        println("Személy: ${name}")
        println("Életkor: ${age}")
    }
    open fun work(){
        println("A személy dolgozik.")
    }
    open fun study(){
        println("A személy tanul.")
    }
    open fun teach(){
        println("A személy tanít.")
    }
}