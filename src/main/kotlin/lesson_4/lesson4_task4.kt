package org.example.lesson_4

fun main () {

    val currentDay = 5
    val firstGroup: Boolean
    val secondGroup: Boolean

    if (currentDay % 2 == 0) {firstGroup = false; secondGroup = true}
    else {firstGroup = true; secondGroup = false}

    println("""
        Упражнения для рук:    $firstGroup
        Упражнения для ног:    $secondGroup
        Упражнения для спины:  $secondGroup
        Упражнения для пресса: $firstGroup
    """.trimIndent())

}