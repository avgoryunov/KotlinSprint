package org.example.lesson_18

class Screen {

    fun draw(
        geometricShape: String,
        x: Int,
        y: Int,
    ) {
        println("Фигура \"$geometricShape\" нарисована в координатах ($x, $y)")
    }

    fun draw(
        geometricShape: String,
        x: Float,
        y: Float,
    ) {
        println("Фигура \"$geometricShape\" нарисована в координатах ($x, $y)")
    }
}

fun main() {
    val screen1 = Screen()

    screen1.draw("Круг", 1, 4)
    screen1.draw("Круг", 1.5f, 4.5f)

    screen1.draw("Квадрат", 2, 6)
    screen1.draw("Квадрат", 2.5f, 6.5f)

    screen1.draw("Точка", 3, 9)
    screen1.draw("Точка", 3.5f, 9.5f)
}