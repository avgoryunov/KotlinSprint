package org.example.lesson_15

interface SwimAction {
    fun swim()
}

interface WalkAction {
    fun walk()
}

interface FlyAction {
    fun fly()
}

class Crucian: SwimAction {
    override fun swim() {
        println("Карась может плавать под водой")
    }
}

class Seagull: WalkAction, FlyAction {
    override fun walk() {
        println("Чайка может ходить")
    }

    override fun fly() {
        println("Чайка может летать")
    }
}

class Duck: SwimAction, WalkAction, FlyAction {
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