package com.example.demo.kotlin_

fun main() {
    val (x, y) = readLine()!!.split(" ").map(String::toInt)
    println(x + y)
}