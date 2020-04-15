package com.example.demo.in_action.chapter_2

fun main() {
    fun recognize(c: Char) = when(c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know..."
    }
    println(recognize('8'))
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}