package com.example.demo.kotlin_2

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
    println(lazyValue)
}