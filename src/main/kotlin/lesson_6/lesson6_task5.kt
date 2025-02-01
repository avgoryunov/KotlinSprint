package org.example.lesson_6

fun main() {
    var numOfAttempts = 3

    while (numOfAttempts > 0) {
        numOfAttempts--
        val numRanOne = (1..9).random()
        val numRanTwo = (1..9).random()
        val numSum = numRanOne + numRanTwo
        print("Сколько будет $numRanOne + $numRanTwo: ")
        val numSumIn = readln(). toInt()
        if (numSum == numSumIn) {
            println("Добро пожаловать!")
            return
        }
    }
    println("Доступ запрещен")
}