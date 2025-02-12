package org.example.lesson_10

fun main() {

    do {
        print("Введите логин: ")
        val login = readln()

        print("Введите пароль: ")
        val password = readln()

    } while (!lengthValidation(loginVal = login, passwordVal = password))

    println("Регистрация прошла успешно!")
}

fun lengthValidation(loginVal: String, passwordVal: String): Boolean {
    return if (loginVal.length < NUMBER_OF_CHARACTERS || passwordVal.length < NUMBER_OF_CHARACTERS) {

        println("Логин или пароль недостаточно длинные")
        return false
    }
    else true
}

const val NUMBER_OF_CHARACTERS = 4