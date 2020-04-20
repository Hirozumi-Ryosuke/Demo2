package com.example.demo.kotlin_1

fun main(){
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    println(when {
        (a * b) % 2 == 0 -> "Even"
            else -> "Odd"
        }
    )
}