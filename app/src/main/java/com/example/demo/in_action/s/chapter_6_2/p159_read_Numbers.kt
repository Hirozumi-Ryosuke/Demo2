package com.example.demo.in_action.s.chapter_6_2

import java.io.BufferedReader

fun main() {
    fun readNumbers(reader: BufferedReader): List<Int?> {
        val result = ArrayList<Int?>()
        for (line in reader.lineSequence()) {
            try {
                val number = line.toInt()
                result.add(number)
            } catch (e: NumberFormatException) {
                result.add(null)
            }
        }
        return result
    }
}