package com.example.demo.competitive_programming

fun main() {
    fun String.lastChar(): Char = get(length - 1)
    println(readLine()!!.lastChar())
}