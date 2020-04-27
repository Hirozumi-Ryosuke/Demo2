package com.example.demo.in_action.s.chapter_10

import kotlin.reflect.KFunction2

fun sum(x: Int, y: Int) = x + y

fun main() {
    val KFunction: KFunction2 <Int, Int, Int> = ::sum
    println(KFunction.invoke(1, 2) + KFunction(3, 4))
}


