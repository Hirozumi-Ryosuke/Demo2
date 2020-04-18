package com.example.demo.in_action.s.chapter_5_2

fun main() {
    println(listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
    )
    println(listOf(1, 2, 3, 4).asSequence()
        .map { it * it }
        .find { it > 3 }
    )
    println(listOf(1, 2, 3, 4)
        .map { it * it }
        .filter { it > 3 }
    )
}
