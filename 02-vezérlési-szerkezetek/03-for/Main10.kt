fun main(){
    val name = "Tibor"
    var count=0
    for (char in name){
        if(char == 'o'){
            count++
        }
    }
    println(count)
}