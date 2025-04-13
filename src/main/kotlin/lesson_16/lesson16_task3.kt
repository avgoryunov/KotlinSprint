package org.example.lesson_16

class User(
    private val loginIn: String,
    private val passwordIn: String,
) {
    private val login: String = "user1"
    private val password: String = "password1"

    fun passwordValidation() {
        if (loginIn != login) return println("Введен неверный логин.")
        if (passwordIn == password) println("Введен верный пароль.")
        else println("Введен неверный пароль.")
    }
}

fun main() {

    val user1 = User(
        "user1",
        "password1",
        )

    user1.passwordValidation()
}