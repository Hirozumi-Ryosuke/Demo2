package com.example.demo.in_action.s.chapter_3

fun main() {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split("[.\\-]".toRegex()))
    println("12.345-6.A".split(".", "-"))
    println("12.345_6.A".split(".", "_"))
}