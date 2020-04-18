package com.example.demo.in_action.s.chapter_5_1

fun main() {
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    println(sum(1, 2))
}