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
        val phoneNumberIn = readln().toLongOrNull()

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
    println(
        "Exception in thread \"main\" java.lang.NumberFormatException: For input string: \"22222222222й\"\n" +
                "\tat java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)\n" +
                "\tat java.base/java.lang.Long.parseLong(Long.java:618)\n" +
                "\tat java.base/java.lang.Long.parseLong(Long.java:722)\n" +
                "\tat org.example.lesson_13.Lesson13_task5Kt.main(lesson13_task5.kt:17)\n" +
                "\tat org.example.lesson_13.Lesson13_task5Kt.main(lesson13_task5.kt)"
    )
}