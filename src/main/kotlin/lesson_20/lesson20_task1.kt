package org.example.lesson_20

class User(
    val name: String,
)

fun main() {
    val user1 = User("Пользователь 1")

    val splashScreen: (String) -> String = { userName: String ->
        "С наступающим Новым Годом, $userName!"
    }

    println(splashScreen(user1.name))
}