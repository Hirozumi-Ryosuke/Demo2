package com.example.demo.in_action.s.chapter_8

fun main() {
    val sum: (Int, Int) -> Unit = { x, y -> println(x + y) }
    val action = { println(42) }
    sum(2, 1)
    action()
}