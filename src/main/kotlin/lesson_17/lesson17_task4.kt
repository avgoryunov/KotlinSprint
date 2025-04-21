package org.example.lesson_17

class Package(
    private val packageNumber: Int,
    currentLocation: String,
) {
    private var movementCounter = 1
    var currentLocation: String = currentLocation
        set(value) {
            field = value
            movementCounter += 1
        }

    fun info() {
        println("Посылка № $packageNumber,\n" +
                "Текущее местоположение - $currentLocation,\n" +
                "Количество перемещений - $movementCounter\n")
    }
}

fun main() {

    val package1 = Package(
        1,
        "Склад 1")

    package1.info()

    package1.currentLocation = "Склад 2"
    package1.info()

    package1.currentLocation = "Склад 3"
    package1.info()
}