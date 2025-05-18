package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("Название 1", "Автор 1")
    val regularBook2 = RegularBook("Название 1", "Автор 1")

    val dataBook1 = DataBook("Название 1", "Автор 1")
    val dataBook2 = DataBook("Название 1", "Автор 1")

    val comparison1 = regularBook1 == regularBook2

    /* При сравнении двух экземпляров обычного класса с помощью метода equals()
    сравниваются ссылки на объекты в памяти, а не значения.
    Результат сравнения - false. */

    val comparison2 = dataBook1 == dataBook2

    /* При сравнении двух экземпляров data - класса с помощью метода equals()
    сравниваются проинициализированные данные.
    Результат сравнения - true. */

    println(comparison1)
    println(comparison2)

    val comparison3 = regularBook1.hashCode() == regularBook2.hashCode()

    /* При сравнении двух экземпляров обычного класса с помощью метода hashCode()
    сравниваются уникальные коды объекта. У одинаковых экземпляров обычного класса хешкод
    генерируется случайным образом для каждого объекта.
    Результат сравнения - false. */

    val comparison4 = dataBook1.hashCode() == dataBook2.hashCode()

    /* При сравнении двух экземпляров data - класса с использованием метода hashCode()
    сравниваются уникальные коды объекта. У одинаковых экземпляров data - класса одинаковый хешкод.
    Результат сравнения - true. */

    println(comparison3)
    println(comparison4)
}