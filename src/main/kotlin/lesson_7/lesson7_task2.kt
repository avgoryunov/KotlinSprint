package org.example.lesson_7

fun main () {

    do {
        val numberRan = (1000 .. 9999).random()
        println("Ваш код авторизации: $numberRan")
        print("Введите код авторизации: ")
        val numberIn = readln().toInt()
        } while (numberRan != numberIn)

    println("Авторизация прошла успешно!")
}