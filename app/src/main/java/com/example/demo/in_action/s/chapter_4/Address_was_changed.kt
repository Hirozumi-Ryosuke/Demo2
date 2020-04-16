package com.example.demo.in_action.s.chapter_4

class User(val name: String) {
    var address: String = readLine()!!
        set(value) {
            println("""
                Address was changed for $name:
                "$field" -> "$value". """.trimIndent())
            field = value
        }
}
fun main() {
    val user = User(name = readLine()!!)
    user.address = readLine()!!
}