package org.example.lesson_4

fun main () {

    println("Наличие повреждений корпуса: true/false")
    val presenceDamage: Boolean = readln().toBoolean()

    println("Текущий состав экипажа:")
    val currentNumberCrew = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val currentNumberBoxesProvisions = readln().toInt()

    println("Благоприятность метеоусловий: true/false")
    val currentFavorableWeather: Boolean = readln().toBoolean()

    if (presenceDamage == PRESENCE_DAMAGE && currentNumberCrew in CURRENT_NUMBER_CREW_MIN .. CURRENT_NUMBER_CREW_MAX &&
        currentNumberBoxesProvisions > NUMBER_BOXES_PROVISIONS) {println("Корабль может отправляться в плавание!")}
    else if (presenceDamage != PRESENCE_DAMAGE && currentNumberCrew == CURRENT_NUMBER_CREW_MAX &&
        currentNumberBoxesProvisions >= NUMBER_BOXES_PROVISIONS &&
        currentFavorableWeather == FAVORABLE_WEATHER) {println("Корабль может отправляться в плавание!")}
    else {println("Корабль не может отправляться в плавание!")}

}

const val PRESENCE_DAMAGE = false
const val CURRENT_NUMBER_CREW_MIN = 55
const val CURRENT_NUMBER_CREW_MAX = 70
const val NUMBER_BOXES_PROVISIONS = 50
const val FAVORABLE_WEATHER = true