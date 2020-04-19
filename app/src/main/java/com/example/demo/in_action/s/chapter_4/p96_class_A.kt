package com.example.demo.in_action.s.chapter_4

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}
fun main() {
    A.bar()
}