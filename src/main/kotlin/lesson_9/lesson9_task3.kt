package org.example.lesson_9

fun main () {

    val quantityPerDish = listOf(2, 50, 15)

    repeat(3) {
        print("Введите количество порций: ")

        val numberDish = readln().toInt()

        val consumptionIngredients = quantityPerDish.map {
            it * numberDish
        }

        println("На $numberDish порций Вам понадобится: яиц – ${consumptionIngredients[0]} шт., " +
                "молока – ${consumptionIngredients[1]} мл., сливочного масла – ${consumptionIngredients[2]} гр.")
    }
}