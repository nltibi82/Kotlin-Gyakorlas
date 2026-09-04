interface CanTeach{
    var subject: String
    val description: String 
        get() = "Tanításra képes személy, szakterület: ${subject}"
    fun teach()
}