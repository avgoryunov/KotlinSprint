package org.example.lesson_19

class Product(
    private val title: String,
    private val id: Int,
    private val category: String,
) {
    fun outputInformation() {
        println("Название - $title, id - $id, категория - ${defineCategory(category)}.")
    }
}

fun main() {
    val product1 = Product("Рубашка", 1, "одежда")
    val product2 = Product("Карандаш", 2, "канцелярские товары")
    val product3 = Product("Зубная щетка", 3, "средства личной гигиены")

    product1.outputInformation()
    product2.outputInformation()
    product3.outputInformation()
}

enum class ProductCategories(val description: String) {
    CLOTHES("одежда"),
    OFFICE_SUPPLIES("канцелярские товары"),
    DIFFERENT("разное");

    fun getCategory(): String {
        return description
    }
}

fun defineCategory(category: String): String {
    return when (category) {
        ProductCategories.CLOTHES.description -> ProductCategories.CLOTHES.getCategory()
        ProductCategories.OFFICE_SUPPLIES.description -> ProductCategories.OFFICE_SUPPLIES.getCategory()
        else -> ProductCategories.DIFFERENT.getCategory()
    }
}