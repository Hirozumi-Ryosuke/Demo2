package com.example.demo.in_action.s.chapter_7_2

fun main() {
    fun splitFilename(fullName: String): NameComponents {
        val (name, extension) = fullName.split('.', limit = 2)
        return NameComponents(name, extension)
    }

    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}