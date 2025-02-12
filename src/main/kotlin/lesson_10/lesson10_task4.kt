package org.example.lesson_10

fun main() {

    var humanVictoryCounter = 0
    var batchCounter = 0

    do {
        val humanProgress = rollDice1()
        println("Ход игрока. \nИгрок бросил кубики с числами: ${humanProgress.joinToString(", ")}. Общая сумма ${humanProgress.sum()}.")

        val computerProgress = rollDice1()
        println("Ход компьютера. \nКомпьютер бросил кубики с числами: ${computerProgress.joinToString(", ")}. Общая сумма ${computerProgress.sum()}.")

        val gameResult = when {
            humanProgress.sum() > computerProgress.sum() -> "Победило человечество."
            humanProgress.sum() < computerProgress.sum() -> "Победила машина."
            else -> "Победила дружба."
        }
        println(gameResult)

        batchCounter += 1
        if (gameResult == "Победило человечество.") humanVictoryCounter += 1

    } while (continuesGame())

    print("Общее количество партий $batchCounter. \nКоличество выиграшных партий человека: $humanVictoryCounter")
}

fun rollDice1(): List<Int> {
    val diceNumber1 = (1..6).random()
    val diceNumber2 = (1..6).random()
    val diceNumber3 = (1..6).random()
    val diceNumberList = listOf(diceNumber1, diceNumber2, diceNumber3)
    return diceNumberList
}

fun continuesGame(): Boolean {
    print("Хотите бросить кости еще раз? Введите Да или Нет: ")
    var userResponse = readln()

    while (userResponse != "Да" && userResponse != "Нет") {
        print("Некорректный ввод. Введите Да или Нет: ")
        userResponse = readln()
    }
    return if (userResponse == "Да") { return true
    } else false
}