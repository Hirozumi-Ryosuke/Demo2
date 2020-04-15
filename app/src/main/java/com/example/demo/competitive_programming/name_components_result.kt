package com.example.demo.competitive_programming

data class NameComponents1(val name: String, val extension: String)

fun main() {
    fun splitFilename(fullName: String): NameComponents1 {
        val result = fullName.split('.', limit = 2)
        return NameComponents1(
            result[0],
            result[1]
        )
    }
    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}