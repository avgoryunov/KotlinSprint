package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    private var readyStatus: String,
) {

    fun changeTheStatus(currentStatus: String) {
        readyStatus = currentStatus
    }

    fun getStatus() {
        println("Номер заказа - $orderNumber, статус заказа - $readyStatus")
    }
}

fun acceptANewStatus(order: Order, currentStatus: String) {
    order.changeTheStatus(currentStatus)
}

fun main() {
    val order1 = Order(
        1,
        "в работе",
    )

    order1.getStatus()
    acceptANewStatus(order1, "готово к выдаче")
    order1.getStatus()
}