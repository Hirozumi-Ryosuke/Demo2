package com.example.demo.in_action.s.chapter_5_1

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.toSet())
    println(people)
    println(setOf(people))
}