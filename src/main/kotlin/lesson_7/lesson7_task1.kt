package org.example.lesson_7

fun main() {

    val letterRan: CharRange = 'a'..'z'
    val numberRan: IntRange = 0..9
    var password = ""

    for (i in 3 downTo 1) password += "${letterRan.random()}${numberRan.random()}"

    println(password)
}