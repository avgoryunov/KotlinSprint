package org.example.lesson_6

fun main() {

    print("Введите количество секунд: ")
    var secNumIn = readln().toInt()
    var secNumOut = ZERO_VALUE

    while (secNumIn > 0) {
        secNumIn--
        secNumOut++
        Thread.sleep(1000)
    }

    if (secNumOut <= 14) {
        when (secNumOut) {
            1 -> println("Прошлa $secNumOut секундa.")
            2, 3, 4 -> println("Прошло $secNumOut секунды.")
            else -> println("Прошло $secNumOut секунд.")
        }
    } else {
        when (secNumOut.toString().last()) {
            '1' -> println("Прошлa $secNumOut секундa.")
            '2', '3', '4' -> println("Прошло $secNumOut секунды.")
            else -> println("Прошло $secNumOut секунд.")
        }
    }
}

const val ZERO_VALUE = 0