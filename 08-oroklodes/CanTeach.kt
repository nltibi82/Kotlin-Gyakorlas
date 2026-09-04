interface CanTeach{
    val subject: String
    val description: String 
        get() = "Tanításra képes személy, szakterület: ${subject}"
    fun teach()
}