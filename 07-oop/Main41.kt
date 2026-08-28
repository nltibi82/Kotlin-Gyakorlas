sealed class Result

class Success(val message: String) : Result()

class Error(val message: String) : Result()

fun printResult(result: Result) {
    when (result) {
        is Success -> println("Siker: ${result.message}")
        is Error -> println("Hiba: ${result.message}")
    }
}

fun main() {
    val success = Success("Sikeres művelet")
    val error = Error("Valami hiba történt")

    printResult(success)
    printResult(error)
}