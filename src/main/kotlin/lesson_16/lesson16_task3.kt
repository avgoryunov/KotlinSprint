package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,
) {

    fun passwordValidation() {
        val loginInput = "user1"
        val passwordInput = "password1"

        if (login != loginInput) return println("Введен неверный логин")

        if (password == passwordInput) println("Введен верный пароль")
        else println("Введен неверный пароль")
    }
}

fun main() {

    val user1 = User(
        "user1",
        "password1",
    )

    user1.passwordValidation()
}