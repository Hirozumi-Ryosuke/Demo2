package com.example.demo.in_action.s.chapter_3

fun main() {
    fun parsePath(path: String) {
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if (matchResult != null) {
            val (directory, filename, extension) = matchResult.destructured
            println("Dir: $directory, name: $filename, ext: $extension")
        }
    }
    val kotlinLogo = """| //  ======
                       .|//     ||
                       .|/ \    ||"""
    println(kotlinLogo.trimMargin("."))
    val price = """${'$'}99.9"""
    println(price)
}