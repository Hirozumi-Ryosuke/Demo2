package com.example.demo.in_action.s.chapter_5

fun main() {
    fun printMessagesWithPrefix(message: Collection<String>, prefix: String) {
        message.forEach {
            println("$prefix $it")
        }
    }
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
}