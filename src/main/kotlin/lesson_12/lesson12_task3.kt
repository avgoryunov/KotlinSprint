package org.example.lesson_12

class DailyWeatherChange2 (
    averageDayTimeTemperatureIn: Int,
    averageNightTimeTemperatureIn: Int,
    precipitationAvailabilityIn: Boolean,
) {
    private val averageDayTimeTemperature: Int = averageDayTimeTemperatureIn - 273
    private val averageNightTimeTemperature: Int = averageNightTimeTemperatureIn - 273
    private val precipitationAvailability: Boolean = precipitationAvailabilityIn


    fun outputToTheConsole() {
        println("Средняя дневная температура: $averageDayTimeTemperature\n" +
                "Средняя ночная температура: $averageNightTimeTemperature\n" +
                "Наличие осадков в течение суток: $precipitationAvailability\n")
    }
}

fun main() {

    val dailyWeatherChange21 = DailyWeatherChange2(
        293,
        288,
        false)

    val dailyWeatherChange22 = DailyWeatherChange2(
        296,
        292,
        true)

    dailyWeatherChange21.outputToTheConsole()
    dailyWeatherChange22.outputToTheConsole()
}