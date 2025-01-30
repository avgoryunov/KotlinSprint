package org.example.lesson_6

fun main() {
    val numRan = (1..9).random()

    var numberOfAttempts = 5

    while (numberOfAttempts > 0) {
        print("Введите число от 0 до 9: ")
        val numIn = readln().toInt()
        numberOfAttempts--

        if (numIn == numRan) {
            println("Это была великолепная игра!")
            return
        } else if (numberOfAttempts == 0) println("Неверно. \nБыло загадано число $numRan.\n")
        else println("Неверно. Оставшееся количество попыток $numberOfAttempts.\n")
    }
}