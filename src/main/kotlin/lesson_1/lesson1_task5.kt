package org.example.lesson_1

import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds


fun main () {
    val numOfNumber = 2
    val numSeconds: Duration = 6480.seconds
    val numMinutes = numSeconds.toComponents {minutes, seconds, _ ->
        "Количество минут: ${minutes.toString().padStart(numOfNumber, '0')} мин.:" +
            "${seconds.toString().padStart(numOfNumber, '0')} сек."}
    println(numMinutes)
    val numHours = numSeconds.toComponents {hours, minutes, seconds, _ ->
        "Количество часов: ${hours.toString().padStart(numOfNumber, '0')} ч.:" +
            "${minutes.toString().padStart(numOfNumber, '0')} мин.:" +
            "${seconds.toString().padStart(numOfNumber, '0')} сек."}
    println(numHours)

}
