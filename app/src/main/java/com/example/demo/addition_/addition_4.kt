package com.example.demo.addition_

fun main() {
/*
    readLine()!!.toInt()
*/
    val list = readLine()!!.split(" ").map(String::toInt)
/*
    val sortedList = list.sortedDescending()
*/
    val sum = list.sum()
    println(sum)
}