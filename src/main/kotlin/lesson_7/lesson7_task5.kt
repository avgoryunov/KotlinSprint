package org.example.lesson_7

fun main () {

    var passwordLength = 0

    while (passwordLength < 6) {
        print("Введите длину пароля (минимальная длина 6 символов): ")
        passwordLength = readln().toInt()
    }

    val bigLetterRan = 'A'..'Z'
    val smallLetterRan = 'a'..'z'
    val numberRan = 0..9
    val passwordList: MutableList<String> = mutableListOf()
    var password = ""

    passwordList.add(bigLetterRan.random().toString())
    passwordList.add(smallLetterRan.random().toString())
    passwordList.add(numberRan.random().toString())

    for (i in 4 .. passwordLength) {
        val listOfCharacters = listOf(bigLetterRan.random(), smallLetterRan.random(), numberRan.random()).random()
        passwordList.add(listOfCharacters.toString())
    }
    passwordList.shuffle()

    for (i in passwordList.indices) password += passwordList[i]
    println(password)
}