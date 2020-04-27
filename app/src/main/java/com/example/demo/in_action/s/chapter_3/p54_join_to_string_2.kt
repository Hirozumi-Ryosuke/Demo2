package com.example.demo.in_action.s.chapter_3

fun main() {
    fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
    ) = joinToString(separator, prefix, postfix)

    println(listOf("one", "two", "eight").join(" "))
}