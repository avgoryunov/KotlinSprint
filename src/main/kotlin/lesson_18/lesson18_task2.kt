package org.example.lesson_18

abstract class Dice {
    abstract val facesNumber: Int

    fun rollTheDice() : String {
        val randomValue: Int = (1..facesNumber).random()
        return "При броске кости с $facesNumber гранями выпало значение: $randomValue"
    }
}

class FourSidedDice : Dice() {
    override val facesNumber: Int = 4
}

class SixSidedDice : Dice() {
    override val facesNumber: Int = 6
}

class EightSidedDice : Dice() {
    override val facesNumber: Int = 8
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