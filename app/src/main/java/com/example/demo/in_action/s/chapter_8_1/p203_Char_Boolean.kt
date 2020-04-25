package com.example.demo.in_action.s.chapter_8_1

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        when {
            predicate(element) -> sb.append(element)
        }
    }
    return sb.toString()
}

fun main() {
    println("ab3c".filter { it in 'a'..'z' })
}