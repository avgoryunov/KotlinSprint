package org.example.lesson_20

fun main() {
    val listOfElements = listOf("1", "2", "3", "4", "5", "6", "7", "8")

    val stringLambdas: List<(String) -> Unit> = listOfElements.map { element ->
        { println("Нажат элемент '$element'") }
    }

    stringLambdas.forEachIndexed { index, function -> if (index % 2 != 0) function("") }
}