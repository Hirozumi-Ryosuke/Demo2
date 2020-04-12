package com.example.demo.addition_

fun main(){
    readLine()!!.toInt()
    val list = readLine()!!.split(" ").map(String::toInt)
    val sortedList = list.sortedDescending()
    val sum = sortedList.filterIndexed { index, _ -> index % 1 == 0 }.sum()
    println(sum)
}