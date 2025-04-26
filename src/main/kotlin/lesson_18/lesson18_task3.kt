package org.example.lesson_18

abstract class Animals (
    val nickname: String,
) {
    abstract fun toEat(): String
    fun toSleep() = "$nickname -> спит"
}

class Fox (
    nickname: String,
) : Animals(nickname) {

    override fun toEat() = "$nickname -> ест ягоды"
}

class Dog (
    nickname: String,
) : Animals(nickname) {

    override fun toEat() = "$nickname -> ест кости"
}

class Cat (
    nickname: String,
) : Animals(nickname) {

    override fun toEat() = "$nickname -> ест рыбу"
}

fun main() {
    val fox1 = Fox("\"Лиса 1\"")
    val dog1 = Dog("\"Собака 1\"")
    val cat1 = Cat("\"Кошка 1\"")

    val list1 = listOf<Animals>(fox1, dog1, cat1)

    list1.forEach {
        println(it.toEat())
        println(it.toSleep())
    }
}