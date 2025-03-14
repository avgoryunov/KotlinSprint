package org.example.lesson_12

import kotlin.random.Random

class MonthWeather1(
    val listMonthlyWeather: MutableList<DailyWeather1> = mutableListOf()
) {

    fun outputToTheConsole (averageDayTimeTemperature: Double, averageNightTimeTemperature: Double, numberOfDaysWithPrecipitation: Int) {
        println(
            "Средняя дневная температура за месяц: %.01f \n".format(averageDayTimeTemperature - KELVIN_CELSIUS) +
                    "Средняя ночная температура за месяц: %.01f \n".format(averageNightTimeTemperature - KELVIN_CELSIUS) +
                    "Количество дней с осадками: $numberOfDaysWithPrecipitation\n"
        )
    }
}

data class DailyWeather1 (
    val dayTimeTemperature: Int,
    val nightTimeTemperature: Int,
    val precipitationAvailability: Boolean,
) {
    init {
        println("Значение дневной температуры: $dayTimeTemperature\n" +
                "Значение ночной температуры: $nightTimeTemperature\n" +
                "Наличие осадков в течение суток: $precipitationAvailability\n")
    }
}

fun List<Int>.setAverageNumber(): Double {
    return this.average()
}

fun main() {

    val monthWeather = MonthWeather1()

    for (i in 0..29) {
        monthWeather.listMonthlyWeather.add(DailyWeather1(
            dayTimeTemperature = (293..303).random(),
            nightTimeTemperature = (283..293).random(),
            precipitationAvailability = Random.nextBoolean(),
        )
        )
    }

    val listDayTimeTemperature = monthWeather.listMonthlyWeather.map { it.dayTimeTemperature }
    val listNightTimeTemperature = monthWeather.listMonthlyWeather.map { it.nightTimeTemperature }
    val numberOfDaysWithPrecipitation: Int = (monthWeather.listMonthlyWeather.map { it.precipitationAvailability}).filter { it }.size

    val averageDayTimeTemperature = listDayTimeTemperature.setAverageNumber()
    val averageNightTimeTemperature = listNightTimeTemperature.setAverageNumber()

    monthWeather.outputToTheConsole(averageDayTimeTemperature, averageNightTimeTemperature, numberOfDaysWithPrecipitation)
}

const val KELVIN_CELSIUS = 273.15