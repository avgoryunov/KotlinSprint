package org.example.lesson_8

fun main () {

    val arrayOfIngredients = arrayOf("курица", "капуста", "помидор", "сыр", "хлеб", "соль", "масло", "перец", "чеснок", "майонез")

    for (i in arrayOfIngredients) println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")

    print("Введите ингредиент, который хотите заменить: ")

    val replaceIngredient = readln()

    if (arrayOfIngredients.indexOf(replaceIngredient) > -1) {

        print("Введите ингредиент, который хотите добавить: ")

        val addIngredient = readln()
        arrayOfIngredients[arrayOfIngredients.indexOf(replaceIngredient)] = addIngredient

        println("Готово! Вы сохранили следующий список:")

        for (i in arrayOfIngredients) println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}