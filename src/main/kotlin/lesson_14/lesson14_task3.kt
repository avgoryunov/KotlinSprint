package org.example.lesson_14

import kotlin.math.PI

abstract class Figure {
    abstract val colour: String
    abstract fun calculateTheArea(): Double
    abstract fun calculateThePerimeter(): Double
}
data class Circle(
    override val colour: String,
    val radius: Double,
) : Figure() {
    override fun calculateTheArea(): Double {
        return PI * radius * radius
    }
    override fun calculateThePerimeter(): Double {
        return COEFFICIENT * PI * radius
    }
}

data class Rectangle(
    override val colour: String,
    val width: Double,
    val height: Double,
) : Figure() {
    override fun calculateTheArea(): Double {
        return width * height
    }

    override fun calculateThePerimeter(): Double {
        return COEFFICIENT * (width + height)
    }
}

fun main() {

    val circle1 = Circle(
        "Черный",
        25.0,
    )

    val circle2 = Circle(
        "Белый",
        15.0,
    )

    val rectangle1 = Rectangle(
        "Черный",
        10.0,
        20.0,
    )

    val rectangle2 = Rectangle(
        "Белый",
        15.0,
        25.0,
    )

    val figures: MutableList<Figure> = mutableListOf()

    figures.add(circle1)
    figures.add(circle2)
    figures.add(rectangle1)
    figures.add(rectangle2)

    var perimeterSumBlack = 0.0
    var areaSumBlack = 0.0
    var perimeterSumWhite = 0.0
    var areaSumWhite = 0.0

    for (figure in figures) {
        if (figure.colour == "Черный") {
            perimeterSumBlack += figure.calculateThePerimeter()
            areaSumBlack += figure.calculateThePerimeter()
        }
        else {
            perimeterSumWhite += figure.calculateThePerimeter()
            areaSumWhite += figure.calculateThePerimeter()
        }
    }

    println(String.format("Сумма периметров всех черных фигур: %.2f", perimeterSumBlack))
    println(String.format("Сумма площадей всех белых фигур: %.2f", areaSumWhite))
}

const val COEFFICIENT = 2