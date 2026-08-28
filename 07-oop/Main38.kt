object AppConfig {
    val appName = "Kotlin Gyakorlás"
    val version = "1.0"

    fun printInfo() {
        println("Alkalmazás: $appName")
        println("Verzió: $version")
    }
}

fun main() {
    AppConfig.printInfo()
}