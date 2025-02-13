package org.example.lesson_9

fun main () {

    val ingredientsSet: MutableSet<String> = sortedSetOf()

    while (ingredientsSet.size < 5) {

        print("Введите название ингредиента: ")
        val incomingIngredient = readln()

        if (!ingredientsSet.add(incomingIngredient)) print("Ингредиент уже в списке. ")
    }
    val ingredientString = ingredientsSet.joinToString(", ").replaceFirstChar { it.uppercase() }

    println(ingredientString)
}