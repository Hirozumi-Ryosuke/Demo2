package com.example.demo.kotlin_1

fun main(){
    readLine()!!.toInt()
    val xs = readLine()!!.split(" ").map(String::toInt)
    val sortedXs = xs.sortedDescending()
    val a = sortedXs.filterIndexed { index, _ -> index % 2 == 0 }.sum()
    val b = sortedXs.filterIndexed { index, _ -> index % 2 == 1 }.sum()
    println(a - b)
}
