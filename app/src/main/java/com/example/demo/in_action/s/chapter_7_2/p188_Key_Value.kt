package com.example.demo.in_action.s.chapter_7_2

fun main() {
    fun printEntries(map: Map<String, String>) {
        for ((key, value) in map) {
            println("$key -> $value")
        }
    }
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
}