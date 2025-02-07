package org.example.lesson_9

fun main () {

    val listIngredients = mutableListOf("молоко", "яйцо", "соль")

    println("В рецепте есть базовые ингредиенты:")

    listIngredients.forEachIndexed { number, name -> println("Ингредиент ${number + 1}: $name") }

    print("Желаете добавить еще? ")

    if (readln().equals("да", true)) {

        print("Какой ингредиент вы хотите добавить? ")

        listIngredients.add(readln())
        listIngredients.forEachIndexed { number, name -> println("Ингредиент ${number + 1}: $name") }
    } else return
}