package org.example.lesson_7

fun main () {

    var passwordLength = 0

    while (passwordLength < 6) {
        print("Введите длину пароля (минимальная длина 6 символов): ")
        passwordLength = readln().toInt()
    }

    val smallLetterRan: CharRange = 'a'..'z'
    val bigLetterRan: CharRange = 'A'..'Z'
    val numberRan: IntRange = 0..9
    var password = ""

    for (i in passwordLength downTo 1)
        password += arrayOf(smallLetterRan.random(), bigLetterRan.random(), numberRan.random()).random()

    println(password)
}