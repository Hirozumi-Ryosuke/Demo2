package com.example.demo.in_action.s.chapter_3

fun main() {
    val strings = listOf("first", "second", "fourteenth")
    val numbers = setOf(1, 14, 2, 5, 5, 78, 6, 30)
    println(strings.last())
    println(strings.first())
    println(strings)
    println(numbers.size)
    println(numbers.sorted())
    println(numbers.sortedDescending())
    println(numbers.average())
    println(numbers.reversed())
    println(numbers.shuffled())
}