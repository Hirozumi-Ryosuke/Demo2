package com.example.demo.in_action.s.chapter_5_2

fun main() {
    fun alphabet() = buildString{
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
    }
    println(alphabet())
}