package com.example.demo.in_action.s.chapter_5_2

fun main() {
    fun alphabet(): String {
        val stringBuilder = StringBuilder()
        return with(stringBuilder) {
            for (letter in 'A'..'Z') {
                this.append(letter)
            }
            append("\nNow I know the alphabet!")
            this.toString()
        }
    }
    println(alphabet())
}