package com.example.demo.in_action.s.chapter_5_1

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ", transform = { p -> p.name})
    val ages = people.joinToString(separator = " ", transform = { p -> p.age.toString() })
    println(names)
    println(ages)
}