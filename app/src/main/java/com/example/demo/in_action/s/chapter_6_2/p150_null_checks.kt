package com.example.demo.in_action.s.chapter_6_2

import java.util.*

class Person(val name: String?)
fun main() {
    fun yellAtSafe(person: Person?) {
        println((person?.name ?: "Anyone").toUpperCase(Locale.ROOT) + "!!!")
    }
    yellAtSafe(null)
    yellAtSafe(Person(null))
    yellAtSafe(Person("John"))
}