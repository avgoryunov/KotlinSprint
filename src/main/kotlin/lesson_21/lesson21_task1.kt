package org.example.lesson_21

fun main() {
    val string = "hello"

    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')

    return this.count { it in vowels }
}