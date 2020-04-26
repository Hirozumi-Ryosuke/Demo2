package com.example.demo.in_action.s.chapter_9

fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun main() {
    println(oneHalf(3))
}