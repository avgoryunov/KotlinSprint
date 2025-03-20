package org.example.lesson_13

data class Subscriber4(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
)

fun main() {

    repeat(5) {
        print("Введите имя: ")
        var nameIn = readln()
        if (nameIn.isEmpty()) nameIn = null.toString()

        print("Введите номер: ")
        var phoneNumberIn: Long? = null
        try {
            phoneNumberIn = readln().toLong()
        } catch (e: NumberFormatException) {
            println("Произошла ошибка: ${e::class.simpleName} - ${e.message}")
        }

        print("Введите компанию: ")
        var companyIn = readln()
        if (companyIn.isEmpty()) companyIn = null.toString()
        println()

        val subscriber4 = Subscriber4(
            name = nameIn,
            phoneNumber = phoneNumberIn,
            company = companyIn,
        )
        println("$subscriber4\n")
    }
}