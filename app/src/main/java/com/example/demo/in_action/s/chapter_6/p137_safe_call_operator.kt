package com.example.demo.in_action.s.chapter_6

import java.util.*

fun main() {
    fun printAllCaps(s: String?) {
        val allCaps = s?.toUpperCase(Locale.ROOT)
        println(allCaps)
    }
    printAllCaps("abc")
    printAllCaps(null)
}