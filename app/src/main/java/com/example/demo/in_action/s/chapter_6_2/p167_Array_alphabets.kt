package com.example.demo.in_action.s.chapter_6_2

fun main() {
    val letters = Array(26) { i -> ('a' + i).toString()}
    println(letters.joinToString(""))
}