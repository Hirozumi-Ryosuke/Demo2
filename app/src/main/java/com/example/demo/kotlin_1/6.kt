package com.example.demo.kotlin_1

fun main(){
    val words = listOf("dream", "dreamer", "erase", "eraser")
    val s = readLine()!!
    val sb = StringBuilder(s)
    while (sb.isNotEmpty()) {
        var deleted = false
        words.forEach { word ->
            when {
                sb.endsWith(word) -> {
                    with(sb) { delete(length - word.length, length) }
                    deleted = true
                }
            }
        }
        if (deleted.not()) break
    }
    println(
        when {
            sb.isEmpty() -> "YES"
            else -> "NO"
        }
    )
}