package com.example.demo.in_action.s.arrayListOf

fun main() {
    val list = arrayListOf("10", "11", "1001")
    for (i in list.indices) {
        println("Argument $i is: ${list[i]}")
    }
}