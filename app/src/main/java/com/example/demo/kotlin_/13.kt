package com.example.demo.kotlin_

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main() {
    fun readNumbers(reader: BufferedReader): List<Int?> {
        val result = ArrayList<Int?>()
        reader.lineSequence().forEach { line ->
            try {
                val number = line.toInt()
                result.add(number)
            } catch (e: NumberFormatException) {
                result.add(null)
            }
        }
        return result
    }

    fun addValidNumbers(numbers: List<Int?>) {
        var sumOfValidNumbers = 0
        var invalidNumbers = 0
        numbers.forEach { number ->
            when {
                number != null -> sumOfValidNumbers += number
                else -> invalidNumbers++
            }
        }
        println("Sum of valid numbers: $sumOfValidNumbers")
        println("Invalid numbers: $invalidNumbers")
    }
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
}