package org.example.lesson_18

class Order(
    private val orderNumber: Int,
) {
    fun displayOrderInformation(
        products: String,
    ) {
        println("Заказ №: $orderNumber, Заказан товар: $products")
    }

    fun displayOrderInformation(
        products: List<String>,
    ) {
        println("Заказ №: $orderNumber, Заказаны следующие товары: $products")
    }
}

fun main() {
    val order1 = Order(1)
    order1.displayOrderInformation("товар 1")

    val order2 = Order(2)
    order2.displayOrderInformation(listOf("товар 1", "товар 2", "товар 3"))
}