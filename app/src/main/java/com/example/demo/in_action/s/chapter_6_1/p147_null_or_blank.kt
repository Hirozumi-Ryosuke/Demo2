package com.example.demo.in_action.s.chapter_6_1

fun main() {
    fun verifyUserInput(input: String?) {
        when {
            input.isNullOrBlank() -> println("Please fill in the required fields")
            else -> println(input)
        }
    }
    verifyUserInput("aaa")
    verifyUserInput(" ")
    verifyUserInput(null)
}