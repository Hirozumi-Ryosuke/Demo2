package com.example.demo.competitive_programming

data class Point(val x: Int, val y: Int)

fun main() {
    operator fun Point.get(index: Int): Int {
        return when(index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")        }
    }
    val p = Point(10, 20)
    println(p[0])
}