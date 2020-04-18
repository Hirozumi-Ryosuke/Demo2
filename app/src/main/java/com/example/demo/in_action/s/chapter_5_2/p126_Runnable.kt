package com.example.demo.in_action.s.chapter_5_2

fun main() {
    fun createAllDoneRunnable(): Runnable {
        return Runnable { println("All done!") }
    }
    createAllDoneRunnable().run()
}