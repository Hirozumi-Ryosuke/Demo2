package com.example.demo.in_action.s.chapter_3

infix fun Any.to(other: Any) = Pair(this, other)

fun main() {
    val (number, name) = 1 to "one"
    val list = listOf(2 to "two", 7 to "seven", 53 to "fifty-three")
    val map = mapOf(2 to "two", 7 to "seven", 53 to "fifty-three")
    println(number)
    println(name)
    println(list)
    println(map)
}