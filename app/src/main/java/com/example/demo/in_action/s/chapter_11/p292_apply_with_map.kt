package com.example.demo.in_action.s.chapter_11

fun main() {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    with(map) { this[3] = "three" }
    println(map)
}