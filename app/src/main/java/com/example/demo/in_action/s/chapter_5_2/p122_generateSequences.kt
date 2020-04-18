package com.example.demo.in_action.s.chapter_5_2

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
    val naturalNumbers_2 = generateSequence(0) { it + 1 }
    val numbersTo100_2 = naturalNumbers_2.take(101)
    println(numbersTo100_2.sum())
}


