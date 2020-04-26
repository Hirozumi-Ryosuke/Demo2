package com.example.demo.in_action.s.chapter_9

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main() {
    printSum(listOf(1, 2, 3))
    printSum(listOf("a", "b", "c"))
}