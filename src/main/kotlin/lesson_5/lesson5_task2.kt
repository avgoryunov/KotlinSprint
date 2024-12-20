package org.example.lesson_5

fun main () {

    val yearBirth = readln().toInt()
    val currentYear = 2024

    val userAge = currentYear - yearBirth
    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться к главному экрану"
    }
    println(resultText)

}

const val AGE_OF_MAJORITY = 18