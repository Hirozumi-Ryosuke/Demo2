package com.example.demo.in_action.s.chapter_9

fun <T: Comparable<T>> max(first: T, second: T) : T {
    return if (first > second) first
    else second
}

fun main() {
    println(max(2, 3))
    println(max("Kotlin", "Java"))
}