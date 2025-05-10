package org.example.lesson_21

class Player1(
    val name: String,
    var currentHealth: Int,
    val maximumHealth: Int = 10,
) {
    fun outputToTheConsole() {
        println("Имя - $name, текущее здоровье - $currentHealth.")
    }
}

fun main() {
    val player1 = Player1("Пользователь 1", 5)

    player1.outputToTheConsole()
    println("Является здоровым: ${player1.isHealthy()}")

    val restoreHealth: (Player1) -> Unit = { it: Player1 -> it.currentHealth = it.maximumHealth }
    restoreHealth(player1)

    player1.outputToTheConsole()
    println("Является здоровым: ${player1.isHealthy()}")

}

fun Player1.isHealthy(): Boolean {
    return currentHealth == maximumHealth
}