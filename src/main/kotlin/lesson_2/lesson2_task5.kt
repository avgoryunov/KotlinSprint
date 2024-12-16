package org.example.lesson_2

import kotlin.math.pow


fun main () {

    val initialDepositAmount = 70_000
    val interestRate = 16.7
    val yearsDepositPeriod = 20

    val finalDepositAmount = initialDepositAmount * (1 + interestRate / FULL_PERCENT).pow(yearsDepositPeriod)

    println("Размер вклада через 20 лет: %.03f".format(finalDepositAmount))

}