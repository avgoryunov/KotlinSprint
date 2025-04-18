package org.example.lesson_16

class Player(
    val playerName: String,
    private var health: Int,
    var impactForce: Int,
) {

    private fun diePlayer() {
        impactForce = 0
    }

    fun getTreatment() {
        if (health > 0) {
            health += 1
            info()
        }
        else {
            println("Доступ к методу лечения запрещен: закончилось здоровье")
        }
    }

    fun getDamage() {
        if (health > 0) {
            health -= 1
            if (health == 0) diePlayer()
            info()
        }
        else println("Доступ к методу урона запрещен: закончилось здоровье")
    }

    private fun info() {
        println("Имя игрока - $playerName, здоровье - $health,  сила удара - $impactForce")
    }
}

fun main() {
    val player1 = Player(
        playerName = "player1",
        health = 5,
        impactForce = 5,
    )

        player1.getDamage()
        player1.getDamage()
        player1.getDamage()
        player1.getDamage()
        player1.getTreatment()
        player1.getDamage()
        player1.getDamage()
        player1.getTreatment()
        player1.getDamage()
}