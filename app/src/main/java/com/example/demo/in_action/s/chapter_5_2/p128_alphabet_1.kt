package com.example.demo.in_action.s.chapter_5_2

fun main() {
    fun alphabet(): String {
        val result = StringBuilder()
        for (letter in 'A'..'Z') {
            result.append(letter)
        }
        result.append("\nNow I know the alphabet!")
        return result.toString()
    }
    println(alphabet())
}