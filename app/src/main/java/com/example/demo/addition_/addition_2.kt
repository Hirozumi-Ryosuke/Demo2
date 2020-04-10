package com.example.demo.addition_

fun main() {
    readLine()!!.toInt()
    val sum = readLine()!!.split(" ").map(String::toInt)
    sum.map {
        println(it)
    }
}