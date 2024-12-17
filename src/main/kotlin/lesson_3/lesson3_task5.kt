package org.example.lesson_3

fun main () {

    val inputLine = "D2-D4;0"

    val splitLine = inputLine.split("-",";")

    val whereFrom = splitLine[0]
    val where = splitLine[1]
    val strokeNumber = splitLine[2]

    println("""
        Откуда: $whereFrom
        Куда: $where
        Номер хода: $strokeNumber
    """.trimIndent())

}