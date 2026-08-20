fun main(){
    var count = 0
    for (i in 1..20){
        if (i % 2 == 0) {
            continue
        }
        count++
    }
    println("Az 1 és 20 közötti páratlan számok száma: $count")
}