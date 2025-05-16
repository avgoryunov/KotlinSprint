package org.example.lesson_22

data class DataBook2(
    val title: String,
    val author: String,
    val year: Int,
)

fun main() {
    val dataBook2 = DataBook2("Название 1", "Автор 1", 2025)
    val (title, author, year) = dataBook2

    println("Название - $title, автор - $author, год - $year")
}