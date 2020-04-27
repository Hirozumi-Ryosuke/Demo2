package com.example.demo.in_action.s.chapter_9

import java.util.*

fun main() {
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> =
        when {
            Random().nextBoolean() -> list
            else -> chars
        }
    println(unknownElements.first())
}