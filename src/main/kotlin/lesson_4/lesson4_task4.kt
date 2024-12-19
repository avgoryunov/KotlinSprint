package org.example.lesson_4

fun main () {

    val currentDay = 5

    val isEven = currentDay % 2 == 0

    println("""
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    ${isEven}
        Упражнения для спины:  ${isEven}
        Упражнения для пресса: ${!isEven}
    """.trimIndent())

}