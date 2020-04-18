package com.example.demo.in_action.s.chapter_5_2

fun main() {
    val strings = listOf("abc", "def")
    println(strings)
    println(strings.flatMap { it.toList() })
}