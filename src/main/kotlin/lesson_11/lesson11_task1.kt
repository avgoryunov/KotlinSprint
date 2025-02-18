package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {

    val user1 = User(
        id = 1,
        login = "login_1",
        password = "password_1",
        email = "email_1",
    )

    val user2 = User(
        id = 2,
        login = "login_2",
        password = "password_2",
        email = "email_2",
    )

    val userData1 = """
        |Данные пользователя ${user1.id}
        |id: ${user1.id}
        |login: ${user1.login}
        |password: ${user1.password}
        |email: ${user1.email}
    """.trimMargin()

    val userData2 = """
        |Данные пользователя ${user2.id}
        |id: ${user2.id}
        |login: ${user2.login}
        |password: ${user2.password}
        |email: ${user2.email} 
    """.trimMargin()

    println("$userData1\n\n$userData2")
}