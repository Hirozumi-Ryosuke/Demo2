package com.example.demo.kotlin_

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    fun readNumber(reader: BufferedReader): Int? {
        return try {
            val line = reader.readLine()
            Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            null
        } finally {
            reader.run { close() }
        }
    }
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}