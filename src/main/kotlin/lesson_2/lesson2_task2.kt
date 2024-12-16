package org.example.lesson_2

fun main () {

    val numSpecialists: Int = 50
    val oneSpecialistSalary: Int = 30000
    val numStudents: Int = 30
    val oneStudentSalary: Int = 20000

    val allSpecialistsSalary = numSpecialists * oneSpecialistSalary
    val allStudentsSalary = numStudents * oneStudentSalary
    val allWorkersSalary = allSpecialistsSalary + allStudentsSalary
    val averageSalary = allWorkersSalary / (numSpecialists + numStudents)

    println("Расходы на зарплату постоянных сотрудников: $allSpecialistsSalary руб.")
    println("Общие расходы на зарплату сотрудников: $allWorkersSalary руб.")
    println("Средняя заработная плата одного сотрудника: $averageSalary руб.")

}