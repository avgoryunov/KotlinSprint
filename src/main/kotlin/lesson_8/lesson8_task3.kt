package org.example.lesson_8

fun main () {

    val arrayOfIngredients = arrayOf("курица", "капуста", "помидор", "сыр", "хлеб", "соль", "масло", "перец", "чеснок", "майонез")

    print("Введите ингредиент, который хотите найти: ")

    val searchIngredient = readln()

    if (arrayOfIngredients.contains(searchIngredient)) println("Ингредиент $searchIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}