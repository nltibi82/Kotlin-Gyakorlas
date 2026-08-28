sealed class Result

class Success(val data: String) : Result()

class Error(val code: Int, val message: String) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> {
            println("Sikeres adat: ${result.data}")
        }

        is Error -> {
            println("Hiba ${result.code}: ${result.message}")
        }
    }
}

fun main() {
    val success = Success("Felhasználói adatok")
    val error = Error(404, "Az adat nem található")

    handleResult(success)
    handleResult(error)
}