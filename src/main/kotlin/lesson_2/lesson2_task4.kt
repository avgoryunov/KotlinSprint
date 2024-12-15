package org.example.lesson_2

fun main () {

    val crystalOre = 7
    val ironOre = 11
    val buffPercentValue = 20

    val buffCrystalOre = (crystalOre.toFloat() * buffPercentValue) / FULL_PERCENT
    val buffIronOre = (ironOre.toFloat() * buffPercentValue) / FULL_PERCENT

    println("Кристаллическая руда (бонусная) %.0f".format(buffCrystalOre))
    println("Железная руда (бонусная) %.0f".format(buffIronOre))

}

const val FULL_PERCENT = 100


