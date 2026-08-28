enum class Direction(val description: String) {
    NORTH("Észak"),
    SOUTH("Dél"),
    EAST("Kelet"),
    WEST("Nyugat");

    fun printInfo() {
        println("$description irány")
    }
}

fun main() {
    val direction = Direction.WEST

    direction.printInfo()
}