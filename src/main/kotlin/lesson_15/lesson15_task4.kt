package org.example.lesson_15

interface ProductAction {
    fun findAccessories(tools: Tools)
}

abstract class Products {
    open val title: String = ""
    open val quantity: Int = 0
}

class MusicStore : ProductAction {
    private val listProducts: MutableList<Products> = mutableListOf()

    fun addProduct(products: Products) {
        listProducts.add(products)
    }

    fun info() {
        println(listProducts)
    }

    private val listComponents: List<Components> by lazy { listProducts.filterIsInstance<Components>() }

    override fun findAccessories(tools: Tools) {
        val listComponentsFilter = listComponents.filter { it.applicability == tools.title }

        println("Выполняется поиск")
        println("Комплектующие для ${tools.title}:")

        for (component in listComponentsFilter) {
            println("- ${component.title}, количество: ${component.quantity} шт.")
        }
    }
}

data class Tools(
    override val title: String,
    override val quantity: Int,
) : Products()

data class Components(
    override val title: String,
    override val quantity: Int,
    val applicability: String,
) : Products()

fun main() {

    val musicStore1 = MusicStore()

    val tool1 = Tools(
        "Инструмент 1",
        2,
    )

    val tool2 = Tools(
        "Инструмент 2",
        3,
    )

    val component1 = Components(
        "Комплектующее 1",
        4,
        "Инструмент 1",
    )

    val component2 = Components(
        "Комплектующее 2",
        6,
        "Инструмент 1",
    )

    val component3 = Components(
        "Комплектующее 3",
        6,
        "Инструмент 2",
    )

    musicStore1.addProduct(tool1)
    musicStore1.addProduct(tool2)
    musicStore1.addProduct(component1)
    musicStore1.addProduct(component2)
    musicStore1.addProduct(component3)
    musicStore1.info()
    musicStore1.findAccessories(tool1)
}