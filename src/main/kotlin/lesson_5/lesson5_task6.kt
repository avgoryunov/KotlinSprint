package org.example.lesson_5


fun main () {

    println("Запиши свой вес (в килограммах):")
    val weightKilograms: Float = readln().toFloat()

    println("Запиши свой рост (в сантиметрах):")
    val heightCentimeters: Float = readln().toFloat()

    val heightMeters = heightCentimeters / CENTIMETRE_IN_METRE
    val bodyMassIndex = weightKilograms / (heightMeters * heightMeters)
    val bodyMassIndexString = String.format("%.2f", bodyMassIndex)

    val weightCategory = when {
        bodyMassIndex < 18.5 -> "Недостаточная масса тела"
        bodyMassIndex >= 18.5 && bodyMassIndex < 25 -> "Нормальная масса тела"
        bodyMassIndex >= 25 && bodyMassIndex < 30 -> "Избыточная масса тела"
        else -> {"Ожирение"}
    }

    println("Индекс массы тела = $bodyMassIndexString, категория веса: $weightCategory")

}

const val CENTIMETRE_IN_METRE = 100