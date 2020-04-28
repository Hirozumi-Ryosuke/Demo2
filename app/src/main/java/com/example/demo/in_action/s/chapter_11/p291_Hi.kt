package com.example.demo.in_action.s.chapter_11

import java.lang.StringBuilder

val appendExcl: StringBuilder.() -> Unit = { this.append("!") }

fun main() {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)

    println(buildString(appendExcl))
}