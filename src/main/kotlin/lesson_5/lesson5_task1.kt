package org.example.lesson_5

fun main () {

    val firstRandomNumber = (1..10).random()
    val secondRandomNumber = (1..10).random()

    println("Вычисли сумму двух чисел: $firstRandomNumber+$secondRandomNumber")
    val sum = readln().toInt()
    if ((firstRandomNumber + secondRandomNumber) == sum) println("Добро пожаловать!")
    else println("Доступ запрещен")

}