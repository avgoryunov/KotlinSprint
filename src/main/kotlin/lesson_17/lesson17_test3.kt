package org.example.lesson_17

class Folders(
    nameIn: String,
    numberOfFilesIn: Int,
    var secret: Boolean = false,
) {
    private val name: String = nameIn
        get() =
            if (secret) "Скрытая папка"
            else field

    private val numberOfFiles: Int = numberOfFilesIn
        get() =
            if (secret) 0
            else field

    fun info() {
        println("Название: $name, количество файлов: $numberOfFiles, секретность: $secret")
    }
}

fun main() {
    val folder1 = Folders("Папка1", 8)
    folder1.info()

    folder1.secret = true
    folder1.info()
}