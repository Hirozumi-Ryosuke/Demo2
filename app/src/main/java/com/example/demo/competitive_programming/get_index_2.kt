package com.example.demo.competitive_programming

data class MutablePoint(var x: Int, var y: Int, var z: Int)

fun main() {
    operator fun MutablePoint.set(index: Int, value: Int) {
        return when(index) {
            0 -> x = value
            1 -> y = value
            2 -> z = value
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }
    val p = MutablePoint(10, 20, 30)
    p[1] = 42
    println(p)
}