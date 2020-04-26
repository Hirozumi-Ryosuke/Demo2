package com.example.demo.in_action.s.chapter_8

import java.util.Locale.*

fun main() {

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    println(letters.joinToString { it.toLowerCase(ROOT) })
    println(letters.joinToString(separator = "! ", postfix = "! ", transform = { it.toUpperCase(ROOT) }))
}