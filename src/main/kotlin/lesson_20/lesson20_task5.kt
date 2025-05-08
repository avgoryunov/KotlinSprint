package org.example.lesson_20

class Robot() {
    val listOfPhrases: List<String> = listOf(
        "Делу время, потехе час",
        "Семь раз отмерь, один отрежь",
        "Дело мастера боится",
        "Терпенье и труд все перетрут",
        "Глаза страшатся, а руки делают"
    )

    var phraseModifier: (String) -> String = { str: String -> str }

    fun say() {
        val phraseOriginal = listOfPhrases.random()
        val phraseModified = phraseModifier(phraseOriginal)
        println(phraseModified)
    }

    fun setModifier(phraseModifier: (String) -> String) {
        this.phraseModifier = phraseModifier
    }
}

fun main() {
    val robot1 = Robot()

    robot1.say()
    robot1.setModifier { str: String -> str.reversed() }
    robot1.say()
}