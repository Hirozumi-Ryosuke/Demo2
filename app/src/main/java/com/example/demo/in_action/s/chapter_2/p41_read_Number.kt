package com.example.demo.in_action.s.chapter_2

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
    val reader = BufferedReader(StringReader("239"))
    readNumber(reader)

    val reader2 = BufferedReader(StringReader("not a number"))
    readNumber(reader2)
}