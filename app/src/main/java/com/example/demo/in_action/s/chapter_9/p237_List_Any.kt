package com.example.demo.in_action.s.chapter_9

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun main() {
    printContents(listOf("abc", "bac"))
}