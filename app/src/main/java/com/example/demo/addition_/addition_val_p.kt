package com.example.demo.addition_

fun main() {
    class Point(val x: Int, val y: Int) {
        operator fun component1() = x
        operator fun component2() = y
        operator fun component3() = x + y
    }
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)
    println(x + y)
}