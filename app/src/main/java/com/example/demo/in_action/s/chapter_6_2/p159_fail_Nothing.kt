package com.example.demo.in_action.s.chapter_6_2

fun main() {
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }
    fail("Error occurred")
}