package com.example.demo.in_action.s.chapter_6_2

fun main() {
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
}