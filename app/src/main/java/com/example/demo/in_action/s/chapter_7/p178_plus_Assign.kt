package com.example.demo.in_action.s.chapter_7

fun main() {
    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}