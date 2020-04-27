package com.example.demo.in_action.s.chapter_9

fun printFirst(list: List<*>) {
    if (list. isNotEmpty()) {
        println(list.first())
    }
}

fun main() {
    printFirst(listOf("Svetlana", "Dmitry"))
}