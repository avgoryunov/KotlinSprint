package org.example.lesson_9

fun main () {

    val ingredientsList: MutableList<String> = mutableListOf()
    var incomingIngredient: String

    repeat(5) {
        print("Введите название ингредиента: ")
        incomingIngredient = readln()

        while (ingredientsList.contains(incomingIngredient)) {
            print("Ингредиент уже в списке. Введите название другого ингредиента: ")
            incomingIngredient = readln()
        }
        ingredientsList.add(incomingIngredient)
    }
    val ingredientString = ingredientsList.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }

    println(ingredientString)
}