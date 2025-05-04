package org.example.lesson_19

class CardFile {
    private val listOfUsers: MutableList<User> = mutableListOf()

    fun addUser(user: User) {
        listOfUsers.add(user)
    }

    fun outputToTheConsole() {
        println("Список пользователей")
        listOfUsers.forEach {
            println("Имя - ${it.name}, пол - ${it.gender}")
        }
    }
}

data class User(
    val name: String,
    val gender: String,
)

fun main() {
    val cardFile = CardFile()

    repeat(5) {
        var name: String
        var gender: String

        do {
            print("Введите имя пользователя: ")
            name = readln()

            print("Введите пол пользователя (MALE, FEMALE): ")
            gender = readln().uppercase()

            val genderCheck = Gender.entries.find { it.name == gender }

            if (genderCheck != null) {
                val user = User(name, Gender.entries[genderCheck.ordinal].genderRu)
                cardFile.addUser(user)
            } else println("Ошибка: Неизвестный пол '$gender'. Пожалуйста, выберите из перечисленных.")
        } while (genderCheck == null)

        println("'$name' внесен в картотеку")
    }
    cardFile.outputToTheConsole()
}

enum class Gender(val genderRu: String) {
    MALE("мужской"),
    FEMALE("женский"),
}