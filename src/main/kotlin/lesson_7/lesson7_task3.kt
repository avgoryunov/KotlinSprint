package org.example.lesson_7

fun main () {
    print("Введите число: ")

    val numberIn = readln().toInt()
    for (i in 0..numberIn step 2) println(i)
}