package com.example.demo.in_action.s.chapter_4

fun main() {
    class LengthCounter {
        var counter: Int = 0
        private set

        fun addWord(word: String) {
            counter += word.length
        }
    }

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}