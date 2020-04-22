package com.example.demo.kotlin_2


fun printAll(strings: Collection<String>) {
    for (s in strings) {
        print("$s ")
    }
    println()
}

fun main() {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "one")
    printAll(stringSet)
}