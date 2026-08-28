enum class Direction(val description: String) {
    NORTH("Észak"),
    SOUTH("Dél"),
    EAST("Kelet"),
    WEST("Nyugat")
}

fun main() {
    val direction = Direction.EAST

    println("Irány: ${direction.description}")
}