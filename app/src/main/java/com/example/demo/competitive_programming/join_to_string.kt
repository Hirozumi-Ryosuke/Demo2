package com.example.demo.competitive_programming

import java.lang.StringBuilder

fun main(){
    fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
    ): String {
        val result = StringBuilder(prefix)

        collection.withIndex().forEach { (index, element) ->
            when {
                index > 0 ->
                    result.append(separator)
            }
            result.append(element)
        }

        result.append(postfix)
        return result.toString()
    }
    val list = listOf(1, 2, 3)
    println(joinToString(collection = list, separator = ",", prefix = "#", postfix = "."))
}