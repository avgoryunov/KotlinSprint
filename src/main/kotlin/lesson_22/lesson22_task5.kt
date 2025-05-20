package org.example.lesson_22

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class GalacticGuide(
    val nameOfThePlaceOrEvent: String,
    val descriptionOfThePlaceOrEvent: String,
    val dateAndTimeOfTheEvent: String,
    val theDistanceOfAPlaceOrEventFromEarthInLightYears: Double,
)

fun main() {

    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formattedDateTime = currentDateTime.format(formatter)

    val galacticGuide1 = GalacticGuide(
        "Альфа Центавра",
        "Тройная звёздная система в созвездии Центавра",
        formattedDateTime,
        4.36,
    )

    val galacticGuideName = galacticGuide1.component1()
    val galacticGuideDescription = galacticGuide1.component2()
    val galacticGuideDate = galacticGuide1.component3()
    val galacticGuideDistance = galacticGuide1.component4()

    println("Название места - $galacticGuideName")
    println("Описание места - $galacticGuideDescription")
    println("Дата и время - $galacticGuideDate")
    println("Расстояние от земли в световых годах - $galacticGuideDistance")
}