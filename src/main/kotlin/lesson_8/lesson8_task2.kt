package org.example.lesson_8

fun main () {

    val arrayOfIngredients = arrayOf("курица", "капуста", "помидор", "сыр", "хлеб", "соль", "масло", "перец", "чеснок", "майонез")

    print("Введите ингредиент, который хотите найти: ")

    val searchIngredient = readln()
    var message = ""

    for (i in arrayOfIngredients.indices) {
        if (searchIngredient == arrayOfIngredients[i]) {
            message = "Ингредиент ${arrayOfIngredients[i]} в рецепте есть"
            break
        } else message = "Такого ингредиента в рецепте нет"
    }
    println(message)
}