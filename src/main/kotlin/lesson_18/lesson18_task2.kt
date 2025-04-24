package org.example.lesson_18

open class Dice {

    open fun rollTheDice() = ""
}

class FourSidedDice : Dice() {
    private val randomValue: Int = (1..4).random()

    override fun rollTheDice() : String {
        return "Значение кости: $randomValue"
    }
}

class SixSidedDice : Dice() {
    private val randomValue: Int = (1..6).random()

    override fun rollTheDice() : String {
        return "Значение кости: $randomValue"
    }
}

class EightSidedDice : Dice() {
    private val randomValue: Int = (1..8).random()

    override fun rollTheDice() : String {
        return "Значение кости: $randomValue"
    }
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