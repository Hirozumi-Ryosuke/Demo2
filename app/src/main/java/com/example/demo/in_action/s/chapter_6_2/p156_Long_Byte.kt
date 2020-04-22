package com.example.demo.in_action.s.chapter_6_2

fun foo(l: Long) = println(l)

fun main() {
    val b: Byte = 1
    val l = b + 1L
    foo(l)
}