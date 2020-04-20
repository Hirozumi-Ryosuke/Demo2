package com.example.demo.kotlin_1

import java.lang.StringBuilder

fun main() {
    fun alphabet() = StringBuilder().apply {
        ('A'..'Z').forEach { letter ->
            append(letter)
        }
        append("\nNow I know the alphabet!")
    }.toString()
    println(alphabet())
}