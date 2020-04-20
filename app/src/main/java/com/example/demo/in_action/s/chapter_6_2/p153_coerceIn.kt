package com.example.demo.in_action.s.chapter_6_2

fun main() {
    fun showProgress(progress: Int) {
        val percent = progress.coerceIn(0, 100)
        println("We're ${percent}% done!")
    }
    showProgress(146)
    showProgress(4)
}