package com.example.demo.in_action.s.chapter_7

fun main() {
    class Point(val x: Int, val y: Int) {
        override fun equals(other: Any?): Boolean {
            return when {
                other === this -> true
                other !is Point -> false
                else -> other.x == x && other.y == y
            }
        }

        override fun hashCode(): Int {
            var result = x
            result = 31 * result + y
            return result
        }
    }

    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(10, 5))
}