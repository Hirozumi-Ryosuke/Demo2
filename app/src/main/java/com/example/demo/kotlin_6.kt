package com.example.demo

fun main(){
    val words = listOf("dream", "dreamer", "erase", "eraser")
    val s = readLine()!!
    val sb = StringBuilder(s)
    while (sb.isNotEmpty()) {
        var deleted = false
        words.forEach { word ->
            when {
                sb.endsWith(word) -> {
                    sb.delete(sb.length - word.length, sb.length)
                    deleted = true
                }
            }
        }
        if (!deleted) break
    }
    println(if (sb.isEmpty()) "YES" else "NO")
}