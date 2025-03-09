package org.example.lesson_12

class DailyWeather {
    var averageDayTimeTemperature: Double = 0.0
    var averageNightTimeTemperature: Double = 0.0
    var precipitationAvailability: Boolean = false

    fun outputToTheConsole(): String {
        return "Средняя дневная температура: $averageDayTimeTemperature\n" +
                "Средняя ночная температура: $averageNightTimeTemperature\n" +
                "Наличие осадков в течение суток: $precipitationAvailability\n"
    }
}

fun main() {

    val dailyWeather1 = DailyWeather()
    dailyWeather1.averageDayTimeTemperature = 6.4
    dailyWeather1.averageNightTimeTemperature = 2.1

    val dailyWeather2 = DailyWeather()
    dailyWeather2.averageDayTimeTemperature = 25.7
    dailyWeather2.averageNightTimeTemperature = 17.2
    dailyWeather2.precipitationAvailability = true

    println("День 1")
    println(dailyWeather1.outputToTheConsole())
    println("День 2")
    println(dailyWeather2.outputToTheConsole())
}