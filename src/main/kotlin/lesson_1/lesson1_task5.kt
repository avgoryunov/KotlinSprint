package org.example.lesson_1


fun main () {

    val numSeconds = 6480
    val numMinutes = String.format("%02d", numSeconds / 60)
    var secRemains = String.format("%02d", numSeconds % 60)
    println("Формат (минуты:секунды): $numMinutes мин.:$secRemains сек.")
    val numHours = String.format("%02d", numSeconds / 3600)
    val minRemains = String.format("%02d", (numSeconds % 3600) / 60)
    secRemains = String.format("%02d", (numSeconds % 3600) % 60)
    println("Формат (часы:минуты:секунды): $numHours ч.:$minRemains мин.:$secRemains сек.")

}
