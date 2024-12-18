package org.example.lesson_4

fun main () {

    val currentWeatherSunny: Boolean = true
    val currentPositionAwningOpen: Boolean = true
    val currentAirHumidity: Int = 20
    val currentTimeYear: String = "зима"

    val favorableConditions = currentWeatherSunny == WEATHER_SUNNY && currentPositionAwningOpen == POSITION_AWNING_OPEN
            && currentAirHumidity == AIR_HUMIDITY && currentTimeYear == TIME_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}

const val WEATHER_SUNNY = true
const val POSITION_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val TIME_YEAR = "не зима"
