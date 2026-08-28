interface A {
    fun show() {
        println("A interfész")
    }
}

interface B {
    fun show() {
        println("B interfész")
    }
}

class Person : A, B {

    override fun show() {
        println("Person osztály")
    }
}

fun main() {
    val person = Person()

    person.show()
}