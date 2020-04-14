package com.example.demo.kotlin_

import androidx.core.view.OneShotPreDrawListener
import androidx.core.view.OneShotPreDrawListener.add
import kotlinx.android.synthetic.*
import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main() {
    fun readNumbers(reader: BufferedReader): List<Int?> {
        val result = ArrayList<Int?>()
        for (line in reader.lineSequence()) {
            try {
                val number = line.toInt()
                result.add(number)
            }
            catch (e: NumberFormatException) {
                return.add(null)
            }
        }
        return result
    }

    fun addValidNumbers(numbers: List<Int?>) {
        var sumOfValidNumbers = 0
        var invalidNumbers = 0
        for (number in numbers) {
            if (number != null) {
                sumOfValidNumbers += number
            } else {
                invalidNumbers++
            }
        }
        println("Sum of valid numbers: $sumOfValidNumbers")
        println("Invalid numbers: $invalidNumbers")
    }
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
}