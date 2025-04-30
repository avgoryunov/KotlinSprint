package org.example.lesson_19

class Spaceship {

    fun takeOff() {
        println("Выполняется взлет")
    }

    fun shootBack() {
        println("Выполняется стрельба")
        // TODO нужна информация о дополнительной логике
    }

    fun landing() {
        TODO("Реализовать логику приземления")
    }
}

fun main() {

    val spaceship1 = Spaceship()

    spaceship1.takeOff()
    spaceship1.shootBack()
    spaceship1.landing()
}