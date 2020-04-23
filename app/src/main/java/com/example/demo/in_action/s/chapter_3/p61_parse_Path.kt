package com.example.demo.in_action.s.chapter_3

fun main() {
    fun parsePath(path: String) {
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")

        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        println("Dir: $directory, name: $fileName, ext: $extension")
    }
    parsePath("/User/user/kotlin-book/chapter.kt")
}