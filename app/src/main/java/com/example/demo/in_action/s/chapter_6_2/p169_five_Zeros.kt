package com.example.demo.in_action.s.chapter_6_2

fun main() {
    val fiveZeros = IntArray(5)
    val fiveZeroToo = intArrayOf(0, 0, 0, 0, 0)
    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
}