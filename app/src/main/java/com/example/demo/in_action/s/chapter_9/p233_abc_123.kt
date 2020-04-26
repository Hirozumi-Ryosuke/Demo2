package com.example.demo.in_action.s.chapter_9

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    println(isA<String>("abc"))
    println(isA<String>(123))

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}