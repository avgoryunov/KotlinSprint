package org.example.lesson_7

fun main () {
    print("Введите количество секунд, которые нужно засеч: ")

    val numberIn = readln().toInt()

    for (i in numberIn downTo 1) {
        println(String.format("%02d", i))
        Thread.sleep(1000)
    }

    println("Время вышло")
}