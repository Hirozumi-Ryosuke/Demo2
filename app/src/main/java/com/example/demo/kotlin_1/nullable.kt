package com.example.demo.kotlin_1

fun main() {
    data class Person(val name: String, val age: Int? = null) {

        fun isOlderThan(other: Person): Boolean? {
            return when {
                age == null || other.age == null -> null
                else -> {
                    age > other.age
                }
            }
        }
    }
    println(Person("Sam", 35).isOlderThan(Person("Kai", 29)))
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}