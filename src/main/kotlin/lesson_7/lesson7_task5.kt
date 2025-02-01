package org.example.lesson_7

fun main () {

    var passwordLength : Int
    do {
        print("Введите длину пароля (должно быть не менее 6 символов): ")
        passwordLength = readln().toInt()
    } while (passwordLength < 6)

    for (i in passwordLength downTo 1) {
        val smallLetterRan: Char = ('a'..'z').random()
        val bigLetterRan: Char = ('A'..'Z').random()
        val numberRan: Int = (1..9).random()
        val list = listOf(smallLetterRan, bigLetterRan, numberRan).random()
        print(list)
    }
}