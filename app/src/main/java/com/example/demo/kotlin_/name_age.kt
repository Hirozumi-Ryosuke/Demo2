package com.example.demo.kotlin_

data class Person(
    val name: String,
    val age: Int? = null
)

    fun main() {
        val persons = listOf(
            Person("Alice"),
            Person("Bob", age = 29)
        )

        val oldest = persons.maxBy { person -> person.age ?: 0 }
        println("The oldest is: $oldest")
}