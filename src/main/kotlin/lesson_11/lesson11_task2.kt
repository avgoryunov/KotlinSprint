package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    private var bio: Boolean = false,
) {
    fun userDataOutput() {
        val userData = """
        |
        |Данные пользователя:
        |id: $id
        |login: $login
        |password: $password
        |email: $email
        |bio: $bio
    """.trimMargin()

        println(userData)
    }

    fun readingAndWritingText() {
        print("Значение bio. Введите \"true\" или \"false\": ")
        bio = readln().toBoolean()
    }

    fun changingThePassword() {

        do {
            print("Введите текущий пароль: ")
            val passwordIn = readln()

            if (passwordIn == password) {

                print("Введите новый пароль: ")
                password = readln()

                println("Пароль изменен.")
                return
            }
            else {
                print("Текущий пароль введен неверно. Желаете повторить? " +
                        "\nВведите \"Да\" или \"Нет\": ")
                var answerIn = readln()

                if (answerIn == "Нет") return

                while (answerIn != "Да") {
                    print("Неверные символы. Введите \"Да\" или \"Нет\": ")
                    answerIn = readln()
                }
            }
        } while (passwordIn != password)
    }
}

fun main() {
    val user21 = User2(
        id = 1,
        login = "log21",
        password = "pass21",
        email = "ema21",
    )

    user21.readingAndWritingText()
    user21.changingThePassword()
    user21.userDataOutput()
}
