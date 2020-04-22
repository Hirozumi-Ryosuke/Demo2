package com.example.demo.in_action.s.arrayListOf

fun main() {
    val list = arrayListOf("10", "11", "1001")
    list.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}