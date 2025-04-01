package org.example.lesson_15

interface Tem {
    var temperature : Int
}

interface Pre {
    var precipitationAmount : Int
}

abstract class WeatherStationStats(override var temperature: Int, override var precipitationAmount: Int) : Tem, Pre

data object Temperature : Tem {
    override var temperature: Int = 18
}

data object PrecipitationAmount : Pre {
    override var precipitationAmount: Int = 5
}

class WeatherServer(temperature: Int, precipitationAmount: Int) : WeatherStationStats(temperature, precipitationAmount) {

    fun info() {
        println("Температура ${temperature} \u00B0С, осадки ${precipitationAmount} мм")
    }
}

fun main() {
    var weatherServer1 = WeatherServer(16, 10)
    weatherServer1.info()
    weatherServer1 = WeatherServer(11, 7)
    weatherServer1.info()
}