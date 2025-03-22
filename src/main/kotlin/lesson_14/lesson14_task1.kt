package org.example.lesson_14

open class Liner(
    val name: String = "liner1",
    val speed: Int = 20,
) {
    private var numberOfPassengers = 6500

    constructor(
        name: String,
        speed: Int,
        numberOfPassengers: Int,
    ): this(name, speed) {
        this.numberOfPassengers = numberOfPassengers
    }

    open fun outputToTheConsole() {
        println("$name:" +
                " - скорость $speed узлов;" +
                " - количество пассажиров $numberOfPassengers.")
    }
}

class Cargo(
    name: String = "cargo1",
    speed: Int = 15,
    private val loadCapacity: Int = 100000,
) : Liner(name, speed) {

    override fun outputToTheConsole() {
        println("$name:" +
                " - скорость $speed узлов;" +
                " - грузоподъемность $loadCapacity тонн.")
    }
}

class IceBreaker(
    name: String = "iceBreaker",
    speed: Int = 10,
    private val iceClass: Boolean = true,
) : Liner(name, speed) {

    override fun outputToTheConsole() {
        println("$name:" +
                " - скорость $speed узлов;" +
                " - ледовый класс $iceClass.")
    }
}

fun main() {
    val liner1 = Liner()
    liner1.outputToTheConsole()

    val cargo1 = Cargo()
    cargo1.outputToTheConsole()

    val iceBreaker1 = IceBreaker()
    iceBreaker1.outputToTheConsole()
}