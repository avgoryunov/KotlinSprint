package org.example.lesson_13

class PhoneDirectory(
    private val listSubscriber: MutableList<Subscriber> = mutableListOf(),
) {

    fun addSubscriber(subscriber: Subscriber) {
        listSubscriber.add(subscriber)
    }

    fun outputToTheConsole() {
        println(listSubscriber)
    }
}

data class Subscriber(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {

    init {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: $company")
    }
}

fun main() {

    val phoneDirectory1 = PhoneDirectory()

    val subscriber1 = Subscriber(
        name = "user1",
        phoneNumber = 11111111111,
        company = "company1",
    )

    val subscriber2 = Subscriber(
        name = "user2",
        phoneNumber = 22222222222,
        company = null,
    )

    phoneDirectory1.addSubscriber(subscriber1)
    phoneDirectory1.addSubscriber(subscriber2)
    phoneDirectory1.outputToTheConsole()
}