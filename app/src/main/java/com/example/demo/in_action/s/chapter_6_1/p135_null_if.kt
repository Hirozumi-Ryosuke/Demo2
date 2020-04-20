package com.example.demo.in_action.s.chapter_6_1

fun main() {
    fun strLenSafe(s: String?) =
        s?.length ?: 0

    val x = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}