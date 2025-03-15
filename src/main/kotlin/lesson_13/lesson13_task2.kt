package org.example.lesson_13

data class Subscriber1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun outputToTheConsole() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {

    val subscriber11 = Subscriber1(
        name = "user1",
        phoneNumber = 11111111111,
        company = "company1",
    )

    val subscriber12 = Subscriber1(
        name = "user2",
        phoneNumber = 22222222222,
    )

    subscriber11.outputToTheConsole()
    subscriber12.outputToTheConsole()
}