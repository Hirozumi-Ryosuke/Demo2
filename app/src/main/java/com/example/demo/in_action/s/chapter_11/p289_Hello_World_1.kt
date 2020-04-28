package com.example.demo.in_action.s.chapter_11

import java.lang.StringBuilder

fun main() {
    fun buildString(
        builderAction: (StringBuilder) -> Unit
    ): String {
        val sb = StringBuilder()
        builderAction(sb)
        return sb.toString()
    }

    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}