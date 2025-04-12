package org.example.lesson_16

class Cube {
    private val number = (1..6).random()

    fun getNumber() = number
}

fun main() {
    val cube1 = Cube()
    println(cube1.getNumber())
}