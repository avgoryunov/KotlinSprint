package org.example.lesson_10

fun main() {

    print("Введите логин: ")
    val loginIn = readln()

    print("Введите пароль: ")
    val passwordIn = readln()

    println(basket(authorization(loginIn = loginIn, passwordIn = passwordIn)))
}

fun authorization(loginIn: String, passwordIn: String) : String {
    val token: String

    if (loginIn == LOGIN && passwordIn == PASSWORD) {
        val bigLetterRan = 'A'..'Z'
        val smallLetterRan = 'a'..'z'
        val numberRan = 0..9
        val passwordList: MutableList<String> = mutableListOf()

        for (i in 1..PASSWORD_LENGTH)
            when (i) {
                in 1..8 -> passwordList.add(bigLetterRan.random().toString())
                in 9..16 -> passwordList.add(smallLetterRan.random().toString())
                in 17..24 -> passwordList.add(numberRan.random().toString())
                else -> passwordList.add(listOf(bigLetterRan.random(), smallLetterRan.random(), numberRan.random()).random().toString())
            }

        passwordList.shuffle()
        token = passwordList.joinToString("")
    } else token = null.toString()

    return token
}

fun basket(token: String): String {
    val list = listOf("помидор", "огурец", "лук", "сметана", "соль")

    val authorizationError = "Неверно введены логин и/или пароль. Авторизуйтесь повторно."
    var listOfProducts = ""

    for (i in list.indices) listOfProducts += "${i + 1}) ${list[i]}\n"

    return if (token == "null") authorizationError
    else listOfProducts
}

const val LOGIN = "qwe"
const val PASSWORD = "123"
const val PASSWORD_LENGTH = 32