package org.example.lesson_5

fun main () {

    val firstNumber = 13
    val secondNumber = 27

    println("Введите первое число от 0 до 42")
    val firstNumberConsole = readln().toInt()

    println("Введите второе число от 0 до 42")
    val secondNumberConsole = readln().toInt()

    val resultText = if ((firstNumberConsole == firstNumber || firstNumberConsole == secondNumber) &&
        (secondNumberConsole == firstNumber || secondNumberConsole == secondNumber)) {
        "Поздравляем! Вы выиграли главный приз!"
    } else if ((firstNumberConsole == firstNumber || firstNumberConsole == secondNumber) ||
        (secondNumberConsole == firstNumber || secondNumberConsole == secondNumber)) {
        println("Победные числа: $firstNumber и $secondNumber")
        "Вы выиграли утешительный приз!"
    } else {
        println("Победные числа: $firstNumber и $secondNumber")
        "Неудача!"
    }

    println(resultText)

}