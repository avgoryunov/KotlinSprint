package org.example.lesson_13

class PhoneDirectory2(
    private val listSubscriber: MutableList<Subscriber2> = mutableListOf(),
) {

    fun addAllSubscriber(subscriber2: List<Subscriber2>) {
        listSubscriber.addAll(subscriber2)
    }

    fun outputToTheConsole() {
        val listCompany: MutableList<String?> = mutableListOf()
        for (i in listSubscriber.indices) listCompany.add(listSubscriber[i].company)
        println(listCompany.mapNotNull { it }.joinToString(", "))
    }
}

data class Subscriber2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    init {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {

    val phoneDirectory2 = PhoneDirectory2()

    val subscriber21 = Subscriber2(
        name = "user1",
        phoneNumber = 11111111111,
    )

    val subscriber22 = Subscriber2(
        name = "user2",
        phoneNumber = 22222222222,
    )

    val subscriber23 = Subscriber2(
        name = "user3",
        phoneNumber = 33333333333,
        company = "null",
    )

    val subscriber24 = Subscriber2(
        name = "user4",
        phoneNumber = 44444444444,
        company = "company4",
    )

    val subscriber25 = Subscriber2(
        name = "user5",
        phoneNumber = 55555555555,
        company = "company5",
    )

    phoneDirectory2.addAllSubscriber(listOf(subscriber21, subscriber22, subscriber23, subscriber24, subscriber25))
    phoneDirectory2.outputToTheConsole()
}