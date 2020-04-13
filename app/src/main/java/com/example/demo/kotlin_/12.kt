package com.example.demo.kotlin_

fun main() {
    fun printEntries(map: Map<String, String>) {
        map.forEach { (key, value) ->
            println("$key -> $value")
        }
    }
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
}