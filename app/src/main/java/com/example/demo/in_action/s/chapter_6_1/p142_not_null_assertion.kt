package com.example.demo.in_action.s.chapter_6_1

fun main() {
    fun ignoreNulls(s: String?) {
        val sNotNull = s!!
        println(sNotNull.length)
    }
    ignoreNulls("aaa")
    ignoreNulls(null)
}