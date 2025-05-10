package org.example.lesson_21

fun main() {
    val listNumber: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println("Сумма четных чисел: ${listNumber.evenNumbersSum()}")
}

fun MutableList<Int>.evenNumbersSum(): Int {
    var sum = 0

    for (number in this) {
        if (number % 2 == 0) sum += number
    }
    return sum
}