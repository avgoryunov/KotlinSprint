package org.example.lesson_6

fun main() {
    print("Введите количество секунд: ")
    val secNumIn = readln().toInt()
    repeat(secNumIn) {Thread.sleep(1000)}
    println("Прошло $secNumIn секунд.")
}

