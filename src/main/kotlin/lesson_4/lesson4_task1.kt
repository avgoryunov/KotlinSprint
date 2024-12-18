package org.example.lesson_4

fun main () {

    val numTablesReservedToday = 13
    val numTablesReservedTomorrow = 9

    val freeTablesToday = numTablesReservedToday < NUMBER_TABLES
    val freeTablesTomorrow = numTablesReservedTomorrow < NUMBER_TABLES

    println("Доступность столиков на сегодня: $freeTablesToday\n" +
            "Доступность столиков на завтра: $freeTablesTomorrow")

}

const val NUMBER_TABLES = 13