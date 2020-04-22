package com.example.demo.in_action.s.chapter_6_1


class Employee(val name: String, val manager: Employee?)
fun main() {
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

    fun managerName(employee: Employee)/* = employee.manager?.name*/
     = when {
        employee.manager != null -> employee.manager.name
        else -> fail("Error occurred")
    }

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)

    println(managerName(developer))
    println(managerName(ceo))
}