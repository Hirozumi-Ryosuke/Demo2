package com.example.demo.in_action.s.chapter_6_1

fun main() {
    fun <T> printHashCode(t: T) {
        println(t?.hashCode())
    }
    printHashCode(null)
}