package org.example.lesson_14

open class Liner1(
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

    open fun performLoading() {
        println("$name: выдвинуть горизонтальный трап со шкафута")
    }

    open fun outputToTheConsole() {
        println("$name:" +
                " - скорость $speed узлов;" +
                " - количество пассажиров $numberOfPassengers.")
    }
}

class Cargo1(
    name: String,
    speed: Int,
    private val loadCapacity: Int,
) : Liner1(name, speed) {

    override fun performLoading() {
        println("$name: активировать погрузочный кран")
    }

    override fun outputToTheConsole() {
        println("$name:" +
                " - скорость $speed узлов;" +
                " - грузоподъемность $loadCapacity тонн.")
    }
}

class IceBreaker1(
    name: String,
    speed: Int,
    private val iceClass: Boolean,
) : Liner1(name, speed) {

    override fun performLoading() {
        println("$name: открыть ворота со стороны кормы")
    }

    override fun outputToTheConsole() {
        println("$name:" +
                " - скорость $speed узлов;" +
                " - ледовый класс $iceClass.")
    }
}

fun main() {
    val liner1 = Liner1()
    liner1.outputToTheConsole()
    liner1.performLoading()

    val cargo1 = Cargo1(
        "cargo1",
        15,
        100000
    )
    cargo1.outputToTheConsole()
    cargo1.performLoading()

    val iceBreaker1 = IceBreaker1(
        "iceBreaker1",
        10,
        true,
    )
    iceBreaker1.outputToTheConsole()
    iceBreaker1.performLoading()
}