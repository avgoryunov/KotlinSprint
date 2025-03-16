package org.example.lesson_13

class PhoneDirectory3(
    private val listSubscriber: MutableList<Subscriber3> = mutableListOf(),
) {

    fun addSubscriber(subscriber3: Subscriber3) {
        if (subscriber3.name == "null" || subscriber3.phoneNumber == null)
            println("Контакт не добавлен. Не введено имя или номер телефона.\n")
        else listSubscriber.add(subscriber3)
    }

    fun outputToTheConsole() {
        for (i in listSubscriber.indices)
            println("${listSubscriber[i].name}, ${listSubscriber[i].phoneNumber}, ${listSubscriber[i].company}")
    }
}

data class Subscriber3(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
)

fun main() {

    val phoneDirectory3 = PhoneDirectory3()

    repeat(5) {
        print("Введите имя: ")
        var nameIn = readln()
        if (nameIn.isEmpty()) nameIn = null.toString()

        print("Введите номер: ")
        val phoneNumberIn = readln().toLongOrNull()

        print("Введите компанию: ")
        var companyIn = readln()
        if (companyIn.isEmpty()) companyIn = null.toString()
        println()

        val subscriber3 = Subscriber3(
            name = nameIn,
            phoneNumber = phoneNumberIn,
            company = companyIn,
        )
        phoneDirectory3.addSubscriber(subscriber3)
    }
    phoneDirectory3.outputToTheConsole()
}