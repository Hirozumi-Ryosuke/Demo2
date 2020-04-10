package com.example.demo.kotlin_

fun main(){
    readLine()!!.toInt()
    val xs = readLine()!!.split(" ").map(String::toInt)
    xs.toSet().size.also {
        println(it)
    }
}
/*    val n = readLine()!!.toInt()
    val xs = IntArray(n) { readLine()!!.toInt() }
    val ans = xs.toSet().size
    println(ans)
*/