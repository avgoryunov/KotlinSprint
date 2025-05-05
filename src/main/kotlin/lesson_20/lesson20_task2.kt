package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maximumHealth: Int = 10,
) {
    fun outputToTheConsole() {
        println("Имя - $name, текущее здоровье - $currentHealth.")
    }
}

fun main() {
    val player1 = Player("Пользователь 1", 5)

    player1.outputToTheConsole()

    val restoreHealth: (Player) -> Unit = { it: Player -> it.currentHealth = it.maximumHealth }
    restoreHealth(player1)

    player1.outputToTheConsole()
}