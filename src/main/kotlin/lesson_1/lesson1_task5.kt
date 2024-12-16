package org.example.lesson_1


fun main () {

    val numSeconds = 6480

    val numMinutes = numSeconds / SECONDS_IN_MINUTE
    var secRemains = numSeconds % SECONDS_IN_MINUTE

    println("%02d мин.:%02d сек.".format(numMinutes, secRemains))

    val numHours = numSeconds / SECONDS_IN_HOUR
    val minRemains = (numSeconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    secRemains = (numSeconds % SECONDS_IN_HOUR) % SECONDS_IN_MINUTE

    println("%02d ч.:%02d мин.:%02d сек.".format(numHours, minRemains, secRemains))

}

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600