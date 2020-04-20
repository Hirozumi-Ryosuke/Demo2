package com.example.demo.kotlin_1

fun main(){
    val n = readLine()!!.toInt()
    val t = readLine()!!.toInt()
    (0..n).forEach { x ->
        (0..(n - x)).forEach { y ->
            val z = n - x - y
            when (t) {
                10000 * x + 5000 * y + 1000 * z -> {
                    println("$x $y $z")
                    return
                }
            }
        }
    }
    println("-1 -1 -1")
}