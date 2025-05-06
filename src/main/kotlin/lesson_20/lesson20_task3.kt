package org.example.lesson_20

class Player1(
    val name: String,
    val doorKey: Boolean,
)

fun main() {
    val player1 = Player1("Игрок 1", true)

    val checkTheDoor: (Player1) -> String = { it: Player1 ->
        if (it.doorKey) "Игрок открыл дверь"
        else "Дверь заперта"
    }

    println(checkTheDoor(player1))
}