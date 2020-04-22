package com.example.demo.in_action.s.chapter_2

fun main() {
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

    println(isLetter('q'))
    println(isNotDigit('x'))
}