package org.example.lesson_15

abstract class WeatherStationStats {
    var currentDate: String = ""
    abstract fun info()
}

data object Temperature : WeatherStationStats() {
    var temperature: Int = 0

    override fun info() {
        return println("Текущая дата: $currentDate, температура: $temperature °С")
    }
}

data object PrecipitationAmount : WeatherStationStats() {
    var precipitationAmount: Int = 0

    override fun info() {
        return println("Текущая дата: $currentDate, количество осадков: $precipitationAmount мм")
    }
}

class WeatherServer {
    fun sendMessage(weatherParameter: WeatherStationStats) {
        if (weatherParameter == Temperature) weatherParameter.info()
        else weatherParameter.info()
    }
}

fun main() {
    val weatherServer1 = WeatherServer()

    Temperature.currentDate = "03.04.2025"
    Temperature.temperature = 18
    PrecipitationAmount.currentDate = "03.04.2025"
    PrecipitationAmount.precipitationAmount = 8

    weatherServer1.sendMessage(Temperature)
    weatherServer1.sendMessage(PrecipitationAmount)
}