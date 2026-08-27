fun main() {
    val first = setOf(10, 20, 30, 40)
    val second = setOf(30, 40, 50, 60)

    val common = first intersect second
    val onlyFirst = first subtract second
    val all = first union second

    println("Közös elemek: $common")
    println("Csak az elsőben: $onlyFirst")
    println("Összes elem: $all")
}