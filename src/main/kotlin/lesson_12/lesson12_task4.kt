package org.example.lesson_12

class DailyWeatherChange3 (
    averageDayTimeTemperatureIn: Int,
    averageNightTimeTemperatureIn: Int,
    precipitationAvailabilityIn: Boolean,
) {
    private val averageDayTimeTemperature: Int = averageDayTimeTemperatureIn - 273
    private val averageNightTimeTemperature: Int = averageNightTimeTemperatureIn - 273
    private val precipitationAvailability: Boolean = precipitationAvailabilityIn

    init {
        println(
            "Средняя дневная температура: $averageDayTimeTemperature\n" +
                    "Средняя ночная температура: $averageNightTimeTemperature\n" +
                    "Наличие осадков в течение суток: $precipitationAvailability\n"
        )
    }
}

fun main() {

    DailyWeatherChange3(
        298,
        288,
        false,
    )

    DailyWeatherChange3(
        296,
        292,
        true,
    )
}