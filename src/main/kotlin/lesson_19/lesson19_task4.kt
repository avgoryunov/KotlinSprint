package org.example.lesson_19

class InvalidNumberOfCartridgeException(message: String) : Exception(message)

class Tank {
    private var numberOfBlueCartridges: Int = 0
    private var numberOfGreenCartridges: Int = 0
    private var numberOfRedCartridges: Int = 0
    private var damage: Int = 0

    fun charge(cartridges: Cartridges) {
        when (cartridges) {
            Cartridges.BLUE -> numberOfBlueCartridges++
            Cartridges.GREEN -> numberOfGreenCartridges++
            Cartridges.RED -> numberOfRedCartridges++
        }
    }

    fun shoot(cartridges: Cartridges) {

        when (cartridges) {
            Cartridges.BLUE ->
                if (numberOfBlueCartridges < 1)
                    throw InvalidNumberOfCartridgeException("Выстрел невозможен. Отсутствует ${cartridges.colour} патрон.")
                else numberOfBlueCartridges--

            Cartridges.GREEN ->
                if (numberOfGreenCartridges < 1)
                    throw InvalidNumberOfCartridgeException("Выстрел невозможен. Отсутствует ${cartridges.colour} патрон.")
                else numberOfGreenCartridges--

            Cartridges.RED ->
                if (numberOfRedCartridges < 1)
                    throw InvalidNumberOfCartridgeException("Выстрел невозможен. Отсутствует ${cartridges.colour} патрон.")
                else numberOfRedCartridges--
        }
        damage += cartridges.impactForce

        println("Выполнен выстрел. Использован ${cartridges.colour} патрон.\nТекущий урон: $damage единиц.\n")
    }

    fun outputToTheConsole() {
        println(
            "Синие патроны: $numberOfBlueCartridges\n" +
                    "Зеленые патроны: $numberOfGreenCartridges\n" +
                    "Красные патроны: $numberOfRedCartridges\n"
        )
    }
}

fun main() {
    val tank1 = Tank()
    tank1.outputToTheConsole()

    tank1.charge(Cartridges.BLUE)
    tank1.charge(Cartridges.GREEN)
    tank1.charge(Cartridges.RED)
    tank1.outputToTheConsole()

    try {
        tank1.shoot(Cartridges.BLUE)
        tank1.shoot(Cartridges.GREEN)
        tank1.shoot(Cartridges.RED)
    } catch (e: InvalidNumberOfCartridgeException) {
        println("Ошибка: ${e.message}")
    }
    tank1.outputToTheConsole()
}

enum class Cartridges(val colour: String, val impactForce: Int) {
    BLUE("синий", 5),
    GREEN("зеленый", 10),
    RED("красный", 20),
}