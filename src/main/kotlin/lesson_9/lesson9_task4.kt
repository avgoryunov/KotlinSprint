package org.example.lesson_9

fun main () {

    print("Введите пять ингредиентов через запятую с пробелом: ")

    val separator = ", "
    val ingredientsList = readln().split(separator)
    val sortIngredients = ingredientsList.sorted()

    println(sortIngredients)
}