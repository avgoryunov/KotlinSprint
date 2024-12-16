package org.example.lesson_3

fun main () {

    var whereFromLetter = "E"
    var whereFromNumber = 2
    var whereLetter = "E"
    var whereNumber = 4
    var strokeNumber = 1

    println("$whereFromLetter$whereFromNumber-$whereLetter$whereNumber; $strokeNumber")

    whereFromLetter = "D"
    whereFromNumber = 2
    whereLetter = "D"
    whereNumber = whereFromNumber + 1
    strokeNumber += 1

    println("$whereFromLetter$whereFromNumber-$whereLetter$whereNumber; $strokeNumber")

}