package com.example.demo.in_action.s.chapter_8_1

fun main() {
    val sum: (Int, Int) -> Unit = { x, y -> println(x + y) }
    val action: () -> Unit = { println(42) }
    sum(2, 1)
    action()
}