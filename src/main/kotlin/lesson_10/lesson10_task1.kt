package org.example.lesson_10

fun main() {

    val humanProgress = rollDice()
    println("Ход игрока. \nИгрок бросил кубики с числами: ${humanProgress.joinToString(", ")}. Общая сумма ${humanProgress.sum()}.")

    val computerProgress = rollDice()
    println("Ход компьютера. \nКомпьютер бросил кубики с числами: ${computerProgress.joinToString(", ")}. Общая сумма ${computerProgress.sum()}.")

    val gameResult = when {
        humanProgress.sum() > computerProgress.sum() -> "Победило человечество."
        humanProgress.sum() < computerProgress.sum() -> "Победила машина."
        else -> "Победила дружба."
    }
    println(gameResult)
}

fun rollDice(): List<Int> {
    val diceNumber1 = (1..6).random()
    val diceNumber2 = (1..6).random()
    val diceNumber3 = (1..6).random()
    val diceNumberList = listOf(diceNumber1, diceNumber2, diceNumber3)
    return diceNumberList
}
