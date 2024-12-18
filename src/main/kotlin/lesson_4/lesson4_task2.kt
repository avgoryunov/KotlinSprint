package org.example.lesson_4

fun main () {

    val averageWeightMin = 35
    val averageWeightMax = 100
    val averagevolume = 100
    var weightCargo = 20
    var volumeCargo = 80

    var averageCategory = (weightCargo > averageWeightMin) && (weightCargo <= averageWeightMax) && (volumeCargo < averagevolume)
    println("Груз с весом $weightCargo кг и объемом $volumeCargo л соответствует категории 'Average': $averageCategory")

    weightCargo = 50
    volumeCargo = 100

    averageCategory = (weightCargo > averageWeightMin) && (weightCargo <= averageWeightMax) && (volumeCargo < averagevolume)

    println("Груз с весом $weightCargo кг и объемом $volumeCargo л соответствует категории 'Average': $averageCategory")

}