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

    private val passwordIn: String = password

    var password: String
        get() {
            var hiddenPassword = ""

            for (i in 0..<passwordIn.length - 1) {
                hiddenPassword += "*"
            }

            return hiddenPassword
        }

        set(value) {
            println("Вы не можете изменить пароль")
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