package org.example.lesson_8

fun main () {

    val arrayOfIngredients = arrayOf("курица", "капуста", "помидор", "сыр", "хлеб", "соль", "масло", "перец", "чеснок", "майонез")

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }

    print("Введите ингредиент, который хотите заменить: ")

    val replaceIngredient = arrayOfIngredients.indexOf(readln())

    if (replaceIngredient == -1) println("Такого ингредиента в рецепте нет")
    else {
        print("Введите ингредиент, который хотите добавить: ")

        arrayOfIngredients[replaceIngredient] = readln()

        println("Готово! Вы сохранили следующий список:")

        for (i in arrayOfIngredients) {
            println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
        }
    }
}