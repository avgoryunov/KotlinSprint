package org.example.lesson_15

abstract class Forum {
    open val name: String = ""
    open val message: String = ""

    fun readTheMessages() {
        println("$name читает сообщения форума")
    }

    fun writeAMessage() {
        println("$name - \"$message\"")
    }
}

data class User(
    override val name: String,
    override val message: String) : Forum()

data class Administrator(
    override val name: String,
    override val message: String) : Forum() {

    fun deleteMessage() {
        println("$name удаляет сообщение")
    }

    fun deleteUser() {
        println("$name удаляет пользователя")
    }
}

fun main() {

    val user1 = User(
        "Пользователь 1",
        "Сообщение пользователя 1")

    val administrator1 = Administrator(
        "Администратор 1",
        "Сообщение администратора 1")

    user1.readTheMessages()
    user1.writeAMessage()
    administrator1.readTheMessages()
    administrator1.writeAMessage()
    administrator1.deleteMessage()
    administrator1.deleteUser()
}