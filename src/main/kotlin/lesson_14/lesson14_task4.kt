package org.example.lesson_14

abstract class CelestialBodies{
    abstract val category: String
    abstract val name: String
    abstract val suitableForLife: Boolean
}

data class Planet(
    override val category: String,
    override val name: String,
    override val suitableForLife: Boolean,
    val listSatellites: MutableList<Satellites> = mutableListOf(),
): CelestialBodies() {

    fun addSatellites(satellites: Satellites) {
        listSatellites.add(satellites)
    }

    fun outputToTheConsole() {
        println("Категория небесного тела: $category\nНазвание: $name\n" +
                "Наличие жизни: $suitableForLife\nСписок спутников: $listSatellites\n")
    }
}

data class Satellites(
    override val category: String,
    override val name: String,
    override val suitableForLife: Boolean,
): CelestialBodies()

fun main() {

    val planets1 = Planet(
        "Планета",
        "Меркурий",
        false,
    )

    val planets2 = Planet(
        "Планета",
        "Земля",
        true,
    )

    val planets3 = Planet(
        "Планета",
        "Юпитер",
        false,
    )

    val satellites1 = Satellites(
        "Спутник",
        "Луна",
        false,
    )

    val satellites2 = Satellites(
        "Спутник",
        "Ио",
        false,
    )

    val satellites3 = Satellites(
        "Спутник",
        "Европа",
        false,
    )

    planets2.addSatellites(satellites1)
    planets3.addSatellites(satellites2)
    planets3.addSatellites(satellites3)
    planets1.outputToTheConsole()
    planets2.outputToTheConsole()
    planets3.outputToTheConsole()
}