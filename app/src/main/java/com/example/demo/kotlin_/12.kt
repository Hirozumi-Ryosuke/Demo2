package com.example.demo.kotlin_

fun main() {
    class Point(val x: Int, val y: Int) {
        override fun equals(obj: Any?): Boolean {
            if (obj === this) return true
            if (obj !is Point) return false
            return obj.x == x && obj.y == y
        }
    }
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
}