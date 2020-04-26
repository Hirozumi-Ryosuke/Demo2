package com.example.demo.in_action.s.chapter_9

val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    println(listOf(1, 2, 3, 4).penultimate)
}