package com.example.demo.in_action.s.chapter_3

fun main() {
    fun String.lastChar(): Char = get(length - 1)
    println("Kotlin".lastChar())
}