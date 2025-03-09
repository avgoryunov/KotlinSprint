package org.example.lesson_12

class DailyWeatherChange(private val averageDayTimeTemperature: Double, private val averageNightTimeTemperature: Double,
                         private val precipitationAvailability: Boolean) {

    fun outputToTheConsole() {
        println("Средняя дневная температура: $averageDayTimeTemperature\n" +
                "Средняя ночная температура: $averageNightTimeTemperature\n" +
                "Наличие осадков в течение суток: $precipitationAvailability\n")
    }
}

fun main() {

    val dailyWeatherChange1 = DailyWeatherChange(
        12.2,
        6.1,
        false)

    val dailyWeatherChange2 = DailyWeatherChange(
        6.6,
        2.3,
        true)

    println("День 1")
    dailyWeatherChange1.outputToTheConsole()
    println("День 2")
    dailyWeatherChange2.outputToTheConsole()
}