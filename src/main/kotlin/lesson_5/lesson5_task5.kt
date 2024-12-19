package org.example.lesson_5

fun main () {

    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()
    val thirdNumber = (0..42).random()

    val listReserved = listOf(firstNumber, secondNumber, thirdNumber)

    println("Введите первое число от 0 до 42")
    val firstNumberConsole = readln().toInt()
    println("Введите второе число от 0 до 42")
    val secondNumberConsole = readln().toInt()
    println("Введите третье число от 0 до 42")
    val thirdNumberConsole = readln().toInt()

    val listConsole = listOf(firstNumberConsole, secondNumberConsole, thirdNumberConsole)

    val coincidences = listReserved intersect listConsole
    val sizeCoincidences = coincidences.size

    val dfd = when (sizeCoincidences) {
        3 -> "Пользователь угадал все числа и выиграл джекпот."
        2 -> "Пользователь получает крупный приз."
        1 -> "Пользователю выплачивается утешительный приз."
        else -> {"Пользователь не угадал ни одного числа."}
    }

    println("$dfd \nВыигрышные числа: ${listReserved [0]}, ${listReserved [1]}, ${listReserved [2]}")

}