package org.example.lesson_5


fun main () {

    println("Введи расстояние поездки (в километрах):")
    val travelDistance: Float = readln().toFloat()

    println("Введи расход топлива на 100 км (в литрах):")
    val fuelConsumption: Float = readln().toFloat()

    println("Введи текущую цену за литр топлива:")
    val fuelPrice: Float = readln().toFloat()

    val totalAmountFuel = (travelDistance * fuelConsumption) / FULL_PERCENTAGE
    val totalFuelPrice = totalAmountFuel * fuelPrice

    println("Общее количество необходимого топлива: ${String.format("%.2f", totalAmountFuel)}")
    println("Итоговая стоимость поездки: ${String.format("%.2f", totalFuelPrice)}")

}

const val FULL_PERCENTAGE = 100