package com.example.demo.in_action.s.chapter_6_2

import java.io.BufferedReader
import java.io.StringReader

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

    fun addValidNumbers(numbers: List<Int?>) {
        var sumOfValidNumbers = 0
        var invalidNumbers = 0
        for (number in numbers) {
            when {
                number != null -> sumOfValidNumbers += number
                else -> invalidNumbers++
            }
        }
        println("Sum of valid numbers: $sumOfValidNumbers")
        println("Invalid numbers: $invalidNumbers")
    }

    val reader = BufferedReader(StringReader("1\nabc\n42\n28\nddd"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)

    val validNumbers = numbers.filterNotNull()
    println("Sum of valid: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}