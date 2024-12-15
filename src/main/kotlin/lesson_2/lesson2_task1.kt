package org.example.lesson_2

fun main () {

    val stuScore1 = 3.0f
    val stuScore2 = 4.0f
    val stuScore3 = 3.0f
    val stuScore4 = 5.0f

    val averageScore = String.format("%.2f", (stuScore1 + stuScore2 + stuScore3 + stuScore4) / 4)

    println("Средний балл: $averageScore")

}