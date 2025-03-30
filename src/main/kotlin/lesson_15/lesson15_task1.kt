package org.example.lesson_15

interface CrucianAction {
    fun swim()
}

interface SeagullAction {
    fun walk()
    fun fly()
}

interface DuckAction {
    fun swim()
    fun walk()
    fun fly()
}

class Crucian: CrucianAction {
    override fun swim() {
        println("Карась может плавать под водой")
    }
}

class Seagull: SeagullAction {
    override fun walk() {
        println("Чайка может ходить")
    }

    override fun fly() {
        println("Чайка может летать")
    }
}

class Duck: DuckAction {
    override fun swim() {
        println("Утка может плавать на поверхности воды")
    }

    override fun walk() {
        println("Утка может ходить")
    }

    override fun fly() {
        println("Утка может летать")
    }
}

fun main() {
    val crucian1 = Crucian()
    val seagull1 = Seagull()
    val duck1 = Duck()

    crucian1.swim()
    seagull1.walk()
    seagull1.fly()
    duck1.swim()
    duck1.walk()
    duck1.fly()
}