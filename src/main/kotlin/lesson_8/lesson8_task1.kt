package org.example.lesson_8

fun main () {

    val weekDay = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
    val numberOfViewsWeek = intArrayOf(0, 0, 0, 0, 0, 0, 0)

    for (i in weekDay.indices) {
        print("Введите количество просмотров за ${weekDay[i]}: ")
        numberOfViewsWeek[i] = readln().toInt()
    }
    println("Количество просмотров за неделю: ${numberOfViewsWeek.sum()}")
}