package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    private var bio: Boolean = false,
) {

    fun outputData() {
        println("""
        |
        |Данные пользователя:
        |id: $id
        |login: $login
        |password: $password
        |email: $email
        |bio: $bio
    """.trimMargin())
    }

    fun setBio() {
        print("Укажите значение bio. Введите \"true\" или \"false\": ")
        bio = readln().toBoolean()
    }

    fun changePassword() {

        print("Введите текущий пароль: ")

        if (readln() == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен")
        } else println("Введен неверный пароль")
    }
}

fun main() {
    val user21 = User2(
        id = 1,
        login = "log21",
        password = "pass21",
        email = "ema21",
    )

    user21.setBio()
    user21.changePassword()
    user21.outputData()
}
