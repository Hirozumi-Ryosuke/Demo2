package com.example.demo.addition_

fun main() {
    val (x, y) = readLine()!!.split(" ").map(String::toInt)
    println(x + y)
}