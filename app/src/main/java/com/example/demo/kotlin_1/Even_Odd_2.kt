package com.example.demo.kotlin_1

fun main() {
    val answer = { x: Int, y: Int -> x * y }
    println(when {
        answer % 2 == 0 -> "Even"
        else -> "odd"
    })
}

private operator fun <P1, P2, R> ((P1, P2) -> R).rem(r: R): Int {
    P1 -> {
        P2 -> this(P1, P2)
    }
}







