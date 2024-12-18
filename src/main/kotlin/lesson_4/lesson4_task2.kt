package org.example.lesson_4

fun main () {

    var weightCargo = 20
    var volumeCargo = 80

    var averageCategory = (weightCargo > AVERAGE_WEIGHT_MIN) && (weightCargo <= AVERAGE_WEIGHT_MAX) && (volumeCargo < AVERAGE_VOLUME)
    println("Груз с весом $weightCargo кг и объемом $volumeCargo л соответствует категории 'Average': $averageCategory")

    weightCargo = 50
    volumeCargo = 100

    averageCategory = (weightCargo > AVERAGE_WEIGHT_MIN) && (weightCargo <= AVERAGE_WEIGHT_MAX) && (volumeCargo < AVERAGE_VOLUME)

    println("Груз с весом $weightCargo кг и объемом $volumeCargo л соответствует категории 'Average': $averageCategory")

}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100