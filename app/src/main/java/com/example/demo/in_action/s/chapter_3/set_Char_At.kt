package com.example.demo.in_action.s.chapter_3

import java.lang.StringBuilder

fun main() {
    var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }
    println("Kotlin".lastChar)
    sb.lastChar = '!'
    val sb = StringBuilder("Kotlin?")
    println(sb)
}