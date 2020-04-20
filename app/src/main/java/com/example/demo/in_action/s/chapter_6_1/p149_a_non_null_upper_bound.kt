package com.example.demo.in_action.s.chapter_6_1

fun main() {
    fun <T: Any> printHashCode(t: T?) {
        println(t.hashCode())
    }
    printHashCode(null)
    printHashCode(1)
    printHashCode("a")
}