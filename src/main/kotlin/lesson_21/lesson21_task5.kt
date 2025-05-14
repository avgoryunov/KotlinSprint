package org.example.lesson_21

fun main() {
    val levelingUpACharacter: MutableMap<String, Int> = mutableMapOf()

    levelingUpACharacter.put("Навык 1", 20)
    levelingUpACharacter.put("Навык 2", 10)
    levelingUpACharacter.put("Навык 3", 60)
    levelingUpACharacter.put("Навык 4", 60)
    levelingUpACharacter.put("Навык 5", 30)

    val maxCategory = levelingUpACharacter.maxCategory()

    if (maxCategory != null) println("\"$maxCategory\" имеет наибольшее количество очков опыта")
    else println("Навыки отсутствуют")
}

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}