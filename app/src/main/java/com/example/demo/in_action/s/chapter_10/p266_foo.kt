package com.example.demo.in_action.s.chapter_10

fun foo(x: Int) = println(x)

fun main() {
    val KFunction = ::foo
    KFunction(42)
}