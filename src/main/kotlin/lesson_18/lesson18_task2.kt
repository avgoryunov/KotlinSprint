package org.example.lesson_18

open class Dice {
    open val nSidedDice: Int = 4
    private val randomValue: Int by lazy { (1 .. nSidedDice).random() }

    fun rollTheDice() = "При броске кости с $nSidedDice гранями выпало значение: $randomValue"
}

class FourSidedDice : Dice()

class SixSidedDice : Dice() {
    override val nSidedDice: Int = 6
}

class EightSidedDice : Dice() {
    override val nSidedDice: Int = 8
}

fun main() {

    val fourSidedDice1 = FourSidedDice()
    val sixSidedDice1 = SixSidedDice()
    val eightSidedDice1 = EightSidedDice()

    val list1 = listOf(fourSidedDice1, sixSidedDice1, eightSidedDice1)

    showAllDice(list1)
}

fun showAllDice(dice1: List<Dice>) {
    dice1.forEach {
        println(it.rollTheDice())
    }
}