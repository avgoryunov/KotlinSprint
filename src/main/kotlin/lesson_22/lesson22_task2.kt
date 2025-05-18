package org.example.lesson_22

class RegularBook1(
    val title: String,
    val author: String,
)

data class DataBook1(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook1("Название 1", "Автор 1")

    /* При выводе в консоль экземпляра обычного класса выводится строковое представление
    объекта по умолчанию в виде непонятного набора символов. Для вывода результатов в консоль
    в читаемом виде в обычном классе необходимо переопределить функцию toString() */

    val dataBook1 = DataBook1("Название 1", "Автор 1")

    /* При выводе в консоль экземпляра data - класса выводится строковое представление
    объекта с полями объекта в читаемом виде через переопределенную функцию toString(),
    используемую в data - классе по умолчанию. */

    println(regularBook1)
    println(dataBook1)
}