package org.example.lesson_18

abstract class Packages(
    val length: Int,
) {
    abstract fun getPackageSurfaceArea()
}

class CubePackage(
    length: Int,
) : Packages(length) {

    override fun getPackageSurfaceArea() {
        val packageSurfaceArea = CUBE_COEFFICIENT * length * length
        println("Площадь куба со стороной $length мм равна $packageSurfaceArea мм³")
    }
}

class RectangularParallelepipedPackage(
    length: Int,
    private val width: Int,
    private val height: Int,
) : Packages(length) {

    override fun getPackageSurfaceArea() {
        val packageSurfaceArea = RECTANGULAR_PARALLELEPIPED_COEFFICIENT * (length * width + length * height + width * height)
        println("Площадь прямоугольного параллелепипеда со сторонами $length x $width x $height мм равна $packageSurfaceArea мм³")
    }
}

fun main() {
    val cubePackage = CubePackage(250)
    val rectangularParallelepipedPackage = RectangularParallelepipedPackage(300,200, 400)

    val package1 = listOf(cubePackage, rectangularParallelepipedPackage)

    package1.forEach {
        it.getPackageSurfaceArea()
    }
}

const val CUBE_COEFFICIENT = 6
const val RECTANGULAR_PARALLELEPIPED_COEFFICIENT = 2