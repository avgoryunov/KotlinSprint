package org.example.lesson_6

fun main() {
    print("Для регистрации в системе создайте учетные данные.\nСоздайте логин:")
    val loginCreate = readlnOrNull()

    print("Создайте пароль:")
    val passwordCreate = readlnOrNull()

    print("\nДля авторизации в системе введите учетные данные.\nВведите логин:")
    var loginEnter = readlnOrNull()

    print("Введите пароль:")
    var passwordEnter = readlnOrNull()

    while (loginCreate != loginEnter || passwordCreate != passwordEnter) {
        print("\nНеверный логин или пароль.\nПроверьте правильность ввода данных и попробуйте ещё раз.\nВведите логин:")
        loginEnter = readlnOrNull()
        print("Введите пароль:")
        passwordEnter = readlnOrNull()
    }

    println("\nАвторизация прошла успешно.")
}