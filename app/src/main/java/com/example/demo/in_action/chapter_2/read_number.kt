package com.example.demo.in_action.chapter_2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main() {
    fun readNumber(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            null
        }

        println(number)
    }
    val reader = BufferedReader(StringReader("not a number"))
    println(readNumber(reader))
}