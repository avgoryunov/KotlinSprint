package org.example.lesson_17

class Quiz(
    question: String,
    answer: String,
) {

    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {

    val quiz1 = Quiz(
        "Сколько будет 5х5?",
        "25",
    )

    println("Вопрос: ${quiz1.question}")
    println("Ответ: ${quiz1.answer}")
}