package org.example.lesson_6

fun main() {

    print("Введите количество секунд: ")
    var secNumIn = readln().toInt()

    while (secNumIn > 0) {
        println("Осталось секунд: $secNumIn")
        secNumIn--
        Thread.sleep(1000)
    }

    println("Время вышло")
}