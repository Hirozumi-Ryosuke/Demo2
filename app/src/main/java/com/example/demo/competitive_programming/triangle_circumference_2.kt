package com.example.demo.competitive_programming

data class Sides(val x: Int, val y: Int, val z: Int)

fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map(String::toInt)
    val sortedList = list.sortedDescending()


}

