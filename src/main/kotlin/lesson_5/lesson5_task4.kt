package org.example.lesson_5

fun main () {

    println("Введите ваш логин:")
    val userName = readln().toString()

    if (userName != REGISTERED_USER_NAME)
        println("Необходимо зарегистрироваться в системе!")
    else {
        println("Введите ваш пароль:")
        val userPassword = readln().toString()

        if (userPassword == REGISTERED_PASSWORD)
            println("Добрый день, $REGISTERED_USER_NAME! Вы авторизовались в системе.")
    }

}

const val REGISTERED_USER_NAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"