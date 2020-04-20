package com.example.demo.in_action.s.chapter_6_1

import java.util.Locale.*

fun main() {
    fun printAllCaps(s: String?) {
        val allCaps = s?.toUpperCase(ROOT)
        println(allCaps)
    }
    printAllCaps("abc")
    printAllCaps(null)
}