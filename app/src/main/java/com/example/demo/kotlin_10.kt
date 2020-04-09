package com.example.demo

fun main(){
    val n = readLine()!!.toInt()
    val sides = readLine()!!.split(" ").map(String::toInt)
    val ans = 0

    (0..n).forEach { i ->
        (0..(n - 1)).forEach { j ->
            (0..(n - 2)).forEach { k ->
                val circumference = i + j + k
                val twoSides = j + k
                when {
                    twoSides > i -> {
                        println(circumference)
                        return
                    }
                }
            }
        }
        println(ans)
    }
}