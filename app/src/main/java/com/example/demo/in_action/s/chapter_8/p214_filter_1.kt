package com.example.demo.in_action.s.chapter_8

fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    println(people.filter { it.age < 30 })
    println(people.filter { it.age > 30 }.map(Person::name))
}
