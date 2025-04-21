package org.example.lesson_17

class User(
    login: String,
    password: String,
) {
    var login: String = login
        set(value) {
            field = value

            println("Логин успешно изменен")
        }

    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
            field = password
        }

    fun info() {
        println("Логин - \"$login\", Пароль - \"$password\"")
    }
}

fun main() {
    val user1 = User(
        "Логин1",
        "Пароль1",
    )

    user1.info()

    user1.login = "Логин2"
    user1.password = "Пароль21"

    user1.info()
}