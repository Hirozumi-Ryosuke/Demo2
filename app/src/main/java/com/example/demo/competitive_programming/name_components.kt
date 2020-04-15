package com.example.demo.competitive_programming

data class NameComponents2(val name: String, val extension: String)

fun main() {
    fun splitFilename(fullName: String): NameComponents2 {
        val (name, extension) = fullName.split('.', limit = 2)
        return NameComponents2(
            name,
            extension
        )
    }
    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}