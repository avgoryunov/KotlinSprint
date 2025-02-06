package org.example.lesson_8

fun main () {

    print("Введите количество планируемых ингредиентов: ")

    val numberOfIngredients = readln().toInt()
    val arrayOfIngredients = arrayOfNulls<String>(numberOfIngredients)

    for (i in arrayOfIngredients) {
        print("Введите ингредиент ${arrayOfIngredients.indexOf(i)+1}: ")
        arrayOfIngredients[arrayOfIngredients.indexOf(i)] = readln()
    }

    print("Введены ингредиенты: \n${arrayOfIngredients.joinToString(", ")}")
}