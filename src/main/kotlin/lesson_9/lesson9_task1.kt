package org.example.lesson_9

fun main () {

    val listIngredients = listOf("курица", "капуста", "помидор", "сыр", "хлеб", "соль", "масло", "перец", "чеснок", "майонез")

    println("В рецепте есть следующие ингредиенты:")

    listIngredients.forEachIndexed { number, name -> println("Ингредиент ${number + 1}: $name") }
}