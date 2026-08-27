fun main() {
    val ages = mapOf(
        "Tibi" to 44,
        "Péter" to 35,
        "Anna" to 28
    )

    val upperCaseNames = ages.mapKeys { it.key.uppercase() }

    println("Eredeti Map: $ages")
    println("Nagybetűs kulcsok: $upperCaseNames")
}