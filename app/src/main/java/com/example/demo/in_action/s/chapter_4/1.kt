package com.example.demo.in_action.s.chapter_4

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("I was clicked")
    }
}

fun main() {
    Button().click()
}