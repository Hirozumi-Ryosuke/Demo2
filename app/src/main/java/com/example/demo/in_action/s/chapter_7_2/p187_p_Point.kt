package com.example.demo.in_action.s.chapter_7_2

import com.example.demo.in_action.s.chapter_7_1.Point

fun main() {
    val (x, y) = Point(10, 20)
    println(x)
    println(y)

    val p = Point(30, 40)
    val (a, b) = p
    println(a)
    println(b)
}