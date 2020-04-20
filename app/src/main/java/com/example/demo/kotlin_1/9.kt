package com.example.demo.kotlin_1

fun main() {
    val (a, b, c, x) = readLine()!!.split(" ").map(String::toInt)
    var ans = 0
    (0..a).forEach { i ->
        (0..b).forEach { j ->
            (0..c).forEach { k ->
                if (500 * i + 100 * j + 50 * k == x) ans++
            }
        }
    }
    println(ans)
}