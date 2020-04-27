package com.example.demo.in_action.s.chapter_10

var counter = 0

fun main() {
    val kProperty = ::counter
    kProperty.setter.call(21)
    println(kProperty.get())
}