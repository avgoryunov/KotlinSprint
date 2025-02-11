package org.example.lesson_10

fun main() {

    print("Введите длину пароля: ")

    val numberOfCharacters = readln().toInt()
    val password = passwordGenerator(numberOfCharacters = numberOfCharacters)
    println("Сгенерированный пароль: $password")
}

fun passwordGenerator(numberOfCharacters: Int): String {

    val passwordList: MutableList<String> = mutableListOf()

    val number = (0..9)
    val characters = listOf("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", " ")

    for (i in 1 .. numberOfCharacters) {
        if ((i % 2) == 1) passwordList.add(number.random().toString())
        else passwordList.add(characters.random())
    }
    return passwordList.joinToString("")
}