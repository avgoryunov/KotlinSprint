package org.example.lesson_2

fun main () {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinute = 457

    val durHours = travelTimeMinute / MINUTES_IN_NOUR
    val minuteRemains = travelTimeMinute % MINUTES_IN_NOUR
    var arrivalHour = departureHour + durHours + (departureMinute + minuteRemains) / MINUTES_IN_NOUR
    if (arrivalHour > HOURS_IN_DAY) arrivalHour -= HOURS_IN_DAY
    val arrivalMinute = (departureMinute + minuteRemains) % MINUTES_IN_NOUR

    println("Время прибытия: %02d ч.:%02d мин.".format(arrivalHour, arrivalMinute))

}

const val MINUTES_IN_NOUR = 60
const val HOURS_IN_DAY = 24