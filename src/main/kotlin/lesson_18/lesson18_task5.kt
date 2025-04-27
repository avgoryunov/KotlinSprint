package org.example.lesson_18

class Screen {

    fun drawCircle(
        x: Int,
        y: Int,
    ) : String {
        return "Фигура \"круг\" нарисована в координатах ($x, $y)"
    }

    fun drawCircle(
        x: Float,
        y: Float,
    ) : String {
        return "Фигура \"круг\" нарисована в координатах ($x, $y)"
    }

    fun drawSquare(
        x: Int,
        y: Int,
    ) : String {
        return "Фигура \"квадрат\" нарисована в координатах ($x, $y)"
    }

    fun drawSquare(
        x: Float,
        y: Float,
    ) : String {
        return "Фигура \"квадрат\" нарисована в координатах ($x, $y)"
    }

    fun drawPoint(
        x: Int,
        y: Int,
    ) : String {
        return "Фигура \"точка\" нарисована в координатах ($x, $y)"
    }

    fun drawPoint(
        x: Float,
        y: Float,
    ) : String {
        return "Фигура \"точка\" нарисована в координатах ($x, $y)"
    }
}

fun main() {
    val screen1 = Screen()

    val circle1 = screen1.drawCircle( 1, 4)
    val circle2 = screen1.drawCircle( 1.5f, 4.5f)

    val square1 = screen1.drawSquare( 2, 6)
    val square2 = screen1.drawSquare( 2.5f, 6.5f)

    val point1 = screen1.drawPoint( 3, 9)
    val point2 = screen1.drawPoint( 3.5f, 9.5f)

    val list1 = listOf(circle1, circle2, square1, square2, point1, point2)

    list1.forEach {
        println(it)
    }
}