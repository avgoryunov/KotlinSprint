package org.example.lesson_11

data class RecipeCategory(
    val listName: MutableList<Recipe> = mutableListOf(),
    var listCategory: MutableList<String> = mutableListOf(),
    val listRecipesFromCategory: MutableList<Recipe> = mutableListOf(),
    var listFavourites: MutableList<String> = mutableListOf(),
) {
    fun addRecipe(recipe: Recipe) {
        listName.add(recipe)
    }

    fun showCategory() {
        listCategory.clear()
        for (i in listName.indices) {
            listCategory += (listName[i].category)
            listCategory = listCategory.distinct().toMutableList()
        }
    }

    fun showRecipesFromCategory(listCategory: String) {
        listRecipesFromCategory.clear()
        for (i in listName.indices) {
            if (listName[i].category == listCategory) listRecipesFromCategory += (listName[i])
        }
    }

    fun showFavourites() {
        listFavourites.clear()
        for (i in listName.indices) {
            if (listName[i].inFavorites) {
                listFavourites += (listName[i].name)
                listFavourites = listFavourites.distinct().toMutableList()
            }
        }
    }
}

    data class Recipe(
        val name: String,
        val category: String,
        val ingredients: MutableList<Ingredient> = mutableListOf(),
        val numberLOfServings: Int = 1,
        var consumptionIngredients: MutableList<Ingredient> = mutableListOf(),
        var inFavorites: Boolean = false,
    ) {

        fun addIngredient(ingredient: Ingredient) {
            ingredients.add(ingredient)
        }

        fun addToFavorites() {
            inFavorites = true
        }

        fun removeFromFavorites() {
            inFavorites = false
        }

        fun calculateIngredients(numberLOfServings: Int) {
            consumptionIngredients.clear()
            consumptionIngredients = ingredients.map { it.copy() }.toMutableList()
            for (i in consumptionIngredients.indices) {
                consumptionIngredients[i].quantity *= numberLOfServings
            }
        }
    }

    data class Ingredient(
        val name1: String,
        var quantity: Int,
        val unitOfMeasurement: String,
    )

    fun main() {

        val ingredient1 = Ingredient(
            name1 = "говяжий фарш",
            quantity = 300,
            unitOfMeasurement = "гр",
        )

        val ingredient2 = Ingredient(
            name1 = "салатный лук",
            quantity = 1,
            unitOfMeasurement = "шт",
        )

        val ingredient3 = Ingredient(
            name1 = "твердый сыр",
            quantity = 100,
            unitOfMeasurement = "гр",
        )

        val recipe1 = Recipe(
            name = "классический гамбургер",
            category = "бургеры",
        )

        val recipe2 = Recipe(
            name = "пепперони",
            category = "пицца",
        )

        val recipe3 = Recipe(
            name = "бургер с грибами и сыром",
            category = "бургеры",
        )

        val recipeCategory1 = RecipeCategory()

        recipe1.addIngredient(ingredient1)
        recipe1.addIngredient(ingredient2)
        recipe1.addIngredient(ingredient3)
        println(recipe1.ingredients)

        recipe1.addToFavorites()
        println(recipe1.inFavorites)
        recipe1.removeFromFavorites()
        println(recipe1.inFavorites)
        recipe2.addToFavorites()

        recipe1.calculateIngredients(numberLOfServings = 3)
        println(recipe1.consumptionIngredients)
        recipe1.calculateIngredients(numberLOfServings = 2)
        println(recipe1.consumptionIngredients)

        recipeCategory1.addRecipe(recipe1)
        recipeCategory1.addRecipe(recipe2)
        recipeCategory1.addRecipe(recipe3)
        println(recipeCategory1.listName)

        recipeCategory1.showFavourites()
        println("Избранное: ${recipeCategory1.listFavourites}")

        recipeCategory1.showCategory()
        println("Категории рецептов: ${recipeCategory1.listCategory}")

        recipeCategory1.showRecipesFromCategory(recipeCategory1.listCategory[0])
        println("Рецепты для категории \"${recipeCategory1.listCategory[0]}\":${recipeCategory1.listRecipesFromCategory}")
    }
