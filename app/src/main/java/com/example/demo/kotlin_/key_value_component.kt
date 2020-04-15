package com.example.demo.kotlin_

fun main() {
    fun printEntries(map: Map<String, String>) {
        map.entries.forEach { entry ->
            val key = entry.component1()
            val value = entry.component2()
            println("$key -> $value")
        }
    }
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
}