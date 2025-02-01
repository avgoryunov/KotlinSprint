package org.example.lesson_7

fun main() {

    for (i in 3 downTo 1) {
        val letterRan: Char = ('a'..'z').random()
        val numberRan: Int = (1..9).random()
        print("$letterRan$numberRan")
    }
}