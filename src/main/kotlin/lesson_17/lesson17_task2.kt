package org.example.lesson_17

class Ship(
    private val _name: String,
    var averageSpeed: Int,
    var homePort: String,
) {
    var name: String
        get() = _name
        set(value) {
            println("Предупреждение: Вы пытались изменить имя корабля на \"$value\". Внесение изменений недоступно.\n")
        }

    fun info() {
        println("Название: $name\nСредняя скорость: $averageSpeed узлов\nПорт приписки: $homePort\n")
    }
}

fun main() {
    val ship1 = Ship(
        "Корабль 1",
        20,
        "Порт 1",
    )

    ship1.info()

    ship1.name = "Корабль 2"
    ship1.averageSpeed = 25
    ship1.homePort = "Порт 2"

    ship1.info()
}