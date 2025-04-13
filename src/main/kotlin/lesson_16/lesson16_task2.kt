package org.example.lesson_16

class Circle(private val radius: Double) {

    private val pi: Double = 3.14

    fun calculateThePerimeter(): Double {
        return PERMANENT*pi*radius
    }

    fun calculateTheArea(): Double {
        return pi * radius * radius
    }

    fun outputToTheConsole() {
        println(String.format("Периметр круга диаметром ${radius+radius} мм: %.2f мм", calculateThePerimeter()))
        println(String.format("Площадь круга диаметром ${radius+radius} мм: %.2f мм2", calculateTheArea()))
    }
}

fun main() {
    val circle1 = Circle(10.0)
    circle1.calculateThePerimeter()
    circle1.calculateTheArea()
    circle1.outputToTheConsole()
}

const val PERMANENT = 2