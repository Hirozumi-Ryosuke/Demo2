package com.example.demo.competitive_programming

fun main(){
    val n = readLine()!!.toInt()
    val sides = readLine()!!.split(" ").map(String::toInt)
    val ans = 0

    (0..n).forEach { x ->
        (0..(n - 1)).forEach { y ->
            (0..(n - 2)).forEach { z ->
                val circumference = x + y + z
                val twoSides = x + y
                when {
                twoSides > z -> {
                    println(circumference)
                    return
                } else -> {
                    println("0")
                }
            }
        }
    }
    println(ans)
    }
}
