package com.example.demo.in_action.s.chapter_8_1

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun main() {
    twoAndThree { i, i2 -> i + i2 }
    twoAndThree { i, i2 -> i * i2 }
}