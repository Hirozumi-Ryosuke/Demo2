package com.example.demo.in_action.s.chapter_10

fun main() {
    data class Person(val name: String, val age: Int)

    val person = Person("Alice", 29)
    val memberProperty = Person::age
    println(memberProperty.get(person))
}