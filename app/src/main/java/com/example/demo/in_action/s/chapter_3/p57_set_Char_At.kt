package com.example.demo.in_action.s.chapter_3

import java.lang.StringBuilder

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}