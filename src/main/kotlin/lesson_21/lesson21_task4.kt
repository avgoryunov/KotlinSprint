package org.example.lesson_21

import java.io.File

fun main() {
    val wordsFile = File("words.txt")
    wordsFile.createNewFile()

    val word = "Hello2"
    wordsFile.writeToFile(word)

    println(wordsFile.readLines())
}

fun File.writeToFile(word: String) {
    val lowerCaseText = word.lowercase()
    val existingContent = if (this.exists()) this.readText() else ""

    this.writeText("$lowerCaseText\n$existingContent")
}