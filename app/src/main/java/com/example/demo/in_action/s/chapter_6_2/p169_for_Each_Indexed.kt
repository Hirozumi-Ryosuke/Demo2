package com.example.demo.in_action.s.chapter_6_2

fun main(args: Array<String>) {
    val args = arrayListOf("10", "11", "1001")
    args.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}