package com.example.demo.kotlin_

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    fun readNumber(reader: BufferedReader): Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        }
        catch (e: NumberFormatException) {
            return null
        }
        finally {
            reader.close()
        }
    }
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}