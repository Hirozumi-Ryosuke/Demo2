package com.example.demo.in_action.s.chapter_7

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    println('a' * 3)
}