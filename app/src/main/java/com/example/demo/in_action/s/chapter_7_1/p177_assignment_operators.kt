package com.example.demo.in_action.s.chapter_7_1

fun main() {
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)

    val numbers = ArrayList<Int>()
    numbers += 42
    numbers += 33
    numbers += 423
    numbers += 0
    println(numbers[3])
}