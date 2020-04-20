package com.example.demo.in_action.s.chapter_6_2

fun main() {
    data class Person(val name: String, val age: Int? = null) {
        fun isOlderThan(other: Person): Boolean? {
            return if (age == null || other.age == null) null else age > other.age
        }
    }
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}