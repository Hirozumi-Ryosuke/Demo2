package com.example.demo.in_action.s.chapter_5_1

import java.util.*

fun main() {
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
    println(numbers.map { it.value.toUpperCase() })
    println(numbers.mapValues { it.value.toUpperCase(Locale.ROOT) })
    println(numbers.mapValues { it.value.toUpperCase(Locale.getDefault()) })
    println(numbers.mapKeys { it.value.toUpperCase() })
}