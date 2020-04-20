package com.example.demo.kotlin_1

fun main() {
    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)
    val ans = (1..n).filter { it.toString().map { it1 -> it1 - '0' }.sum() in a..b }
        .sum()
    println(ans)
}