enum class Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main() {
    val direction = Direction.EAST

    when (direction) {
        Direction.NORTH -> println("Észak")
        Direction.SOUTH -> println("Dél")
        Direction.EAST -> println("Kelet")
        Direction.WEST -> println("Nyugat")
    }
}